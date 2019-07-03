package Service;

import java.io.File;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;

import Commend.AccomodationRoomRegisterCommend;
import Commend.MovieRegisterCommand;
import Model.AccomodationRegisterDTO;
import Model.MovieRegisterDTO;
import Repository.MovieRegistRepository;

public class MovieRegisterService {
	@Autowired
	private MovieRegistRepository movieRegistRepository;
	
	private File file = null;
	private String originalFile = null;
	private String originalFileExtension = null;
	private String storeFile = null;
	private String time1;
	private String time2;
	private String originalFiles = "";
	private String storeFiles = "";
	private String path;

	public String movieInsert(Model model,MovieRegisterCommand mRcommend,HttpServletRequest request) {
		System.out.println(request.getRealPath("/WEB-INF/view/")+"Product\\date\\");
		String filePath = request.getRealPath("/WEB-INF/view/")+"Product\\date\\";
		System.out.println(mRcommend.getBoardFile()+"뭐냐");
		MultipartFile[] reports = mRcommend.getBoardFile();
       
		for(MultipartFile report : reports) {
			originalFile = report.getOriginalFilename();
			originalFileExtension = originalFile.substring(originalFile.lastIndexOf("."));
			storeFile = UUID.randomUUID().toString().replaceAll("-", "");
			storeFile = storeFile + originalFileExtension;
			file = new File(filePath+storeFile); 
			System.out.println(filePath+storeFile+" filePath+storeFile");
			try {
				report.transferTo(file);
				System.out.println(originalFile +" originalFile");
				originalFiles += originalFile +"-";
				storeFiles += storeFile + "-";
                 System.out.println(originalFiles+"뭐냐");
			}catch(Exception e) {
				e.printStackTrace();
			}

		}
		System.out.println(originalFiles+"파일스");
		MovieRegisterDTO mRdto =new MovieRegisterDTO(mRcommend.getMovieTitle(),mRcommend.getMovieKind()
				,mRcommend.getMovieAge(),mRcommend.getMovieTime(),mRcommend.getMoviePrice()
				,originalFiles,mRcommend.getMovieInform(),storeFiles);
		
		Integer i1=movieRegistRepository.movieInsert(mRdto);
		
		originalFiles="";
		storeFiles="";
		
		if(i1 > 0) {  
			path="RegisterComplete";
			return	path;
		}else {
			String[] fileNames = storeFiles.split("-");
			for(String fileName : fileNames) {
				File f = new File(filePath+fileName);
				if(f.exists()) 
				{	
					f.delete(); 
				}
			}
			return  "report/submissionForm";
		}
	}
}

