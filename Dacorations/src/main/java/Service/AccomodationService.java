package Service;

import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;

import Commend.AccomodationRegisterCommend;
import Commend.AccomodationRoomRegisterCommend;
import Commend.MemberRegisterCommend;
import Model.AccomodationDTO;
import Model.AccomodationRegisterDTO;
import Model.MemberDTO;
import Repository.AccomodationRepository;
import Repository.MemberSessionRepository;

public class AccomodationService {
	@Autowired
	private AccomodationRepository accomodationRepository;	
	private File file = null;
	private String originalFile = null;
	private String originalFileExtension = null;
	private String storeFile = null;
	private String time1;
	private String time2;
	private String originalFiles = "";
	private String storeFiles = "";
	private String filesSize = "";

	//AccomodationInsert 메소드
	public Integer accomodationinsert(AccomodationRegisterCommend aCommend,HttpServletRequest request) {

		Integer result = 0;
		String area=aCommend.getAddress().substring(0,2);
		String address=aCommend.getAddress()+" "+aCommend.getAddressDetail();
		String tell=tell=aCommend.getTell()[0]+aCommend.getTell()[1]+aCommend.getTell()[2];
		System.out.println(request.getRealPath("/WEB-INF/view/")+"Accomodation\\upfile\\");
		String filePath = request.getRealPath("/WEB-INF/view/")+"Accomodation\\upfile\\";
		MultipartFile report = aCommend.getBoardFile();
		originalFile = report.getOriginalFilename();
		System.out.println(originalFile);
		originalFileExtension =originalFile.substring(originalFile.lastIndexOf("."));
		storeFile = UUID.randomUUID().toString().replaceAll("-", "");
		storeFile = storeFile + originalFileExtension;
		file = new File(filePath+storeFile); 
		try {
			report.transferTo(file);
		} catch (IllegalStateException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		AccomodationDTO aDto = new AccomodationDTO(aCommend.getbFacilityName(),address,area,aCommend.getAccomodationKind(),tell,originalFile,storeFile,aCommend.getbFacilityImform());

		result=accomodationRepository.insertAccomodation(aDto);
		return result;
	}
	public List<AccomodationDTO> accomodationList(Model model) {

		List<AccomodationDTO> list=accomodationRepository.listAccomodation();
		List<AccomodationDTO> listCount=accomodationRepository.listAccomodationCount();
		model.addAttribute("list",list);
		model.addAttribute("AccomodationCount",listCount);
		return list;
	}

	public void accomodationEachList(Model model,String kind) {

		List<AccomodationDTO> list=accomodationRepository.listEachAccomodation(kind);
		AccomodationDTO aDto=accomodationRepository.accomodationCount(kind);

		Integer count=aDto.getCount();
		model.addAttribute("list",list);
		model.addAttribute("kind",kind);
		model.addAttribute("count",count);

	}
	public void accomodationArea(Model model,String area,String kind) {

		List<AccomodationDTO> list=accomodationRepository.accomodationArea(area,kind);
		model.addAttribute("list",list);

	}
	public void accomodationPrice(Model model,String kind) {

		List<AccomodationDTO> list=accomodationRepository.accomodationPrice(kind);
		model.addAttribute("list",list);

	}
	public void accomodationLowPrice(Model model,String kind) {

		List<AccomodationDTO> list=accomodationRepository.accomodationLowPrice(kind);
		model.addAttribute("list",list);

	}	
	
}
