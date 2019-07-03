package Service;

import java.io.File;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;

import Commend.AccomodationRoomRegisterCommend;
import Model.AccomodationDTO;
import Model.AccomodationRegisterDTO;
import Repository.AccomodationDetailRepository;
import Repository.AccomodationRepository;

public class AccomodationDetailService {
	@Autowired
	private AccomodationDetailRepository accomodationDetailRepository;	

	private File file = null;
	private String originalFile = null;
	private String originalFileExtension = null;
	private String storeFile = null;
	private String time1;
	private String time2;
	private String originalFiles = "";
	private String storeFiles = "";
	private String filesSize = "";
	private String path = null;
    private Long avg;
	public void accomodationRoom(Model model,Long nume) {
        AccomodationDTO aDto=accomodationDetailRepository.accomodationRoom(nume);
		List<AccomodationRegisterDTO> list=accomodationDetailRepository.accomodationRoomList(nume);
		avg=accomodationDetailRepository.accomodationAvg(nume);
		accomodationDetailRepository.accomodationAvgInsert(nume,avg);
		model.addAttribute("aDto",aDto);	
		model.addAttribute("list",list);	
	
	}
	public String accomodationRegister(Model model,AccomodationRoomRegisterCommend aRcommend,HttpServletRequest request) {
		System.out.println(request.getRealPath("/WEB-INF/view/")+"Product\\date\\");
		String filePath = request.getRealPath("/WEB-INF/view/")+"Product\\date\\";
		MultipartFile[] reports = aRcommend.getBoardFile();
  
		for(MultipartFile report : reports) {
			originalFile = report.getOriginalFilename();
			System.out.println(originalFile+" originalFile");
			originalFileExtension = originalFile.substring(originalFile.lastIndexOf("."));
			System.out.println(originalFileExtension+" originalFileExtension ");
			storeFile = UUID.randomUUID().toString().replaceAll("-", "");
			System.out.println(storeFile+" storeFile");
			storeFile = storeFile + originalFileExtension;
			System.out.println(storeFile+" storeFile");
			file = new File(filePath+storeFile); 
			System.out.println(filePath+storeFile+" filePath+storeFile");
			try {
				report.transferTo(file);
				System.out.println(originalFile +" originalFile");
				originalFiles += originalFile +"-";
				storeFiles += storeFile + "-";

			}catch(Exception e) {	
				e.printStackTrace();
			}

		}
		time1=aRcommend.getProAdTime1()+" "+aRcommend.getProAdTime2()+":"+aRcommend.getProAdTime3();
		time2=aRcommend.getProExTime1()+" "+aRcommend.getProExTime2()+":"+aRcommend.getProExTime3();

		AccomodationRegisterDTO aRDTO =new AccomodationRegisterDTO(aRcommend.getNum(),aRcommend.getaProPrice(),
				time1,time2,aRcommend.getaProKind(),aRcommend.getCount(),originalFiles,storeFiles);
		Integer i1;
        aRDTO.setRoomNum(accomodationDetailRepository.dateProductNum());
		accomodationDetailRepository.dateProduct(aRDTO);
		i1=accomodationDetailRepository.roomRegister(aRDTO);
		originalFiles="";
		storeFiles="";
		
		if(i1 > 0) {  
			return	path ="RegisterComplete";
		}else {
			String[] fileNames = storeFiles.split("-");
			for(String fileName : fileNames) {
				File f = new File(filePath+fileName);
				if(f.exists()) 
				{	
					f.delete(); 
				}
			}
			return path = "report/submissionForm";
		}
	}
}
