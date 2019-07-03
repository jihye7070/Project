package Service;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;

import Commend.FoodCommand;
import Commend.RestaurantOptionCommand;
import Commend.RestaurantRegisterCommand;
import Model.FoodDTO;
import Model.RestaurantDTO;
import Repository.RestaurantRepository;
import other.AutoPaging;

public class RestaurantService {

	@Autowired
	private RestaurantRepository restaurantRepository;

	private File file = null;
	private String originalFile = null;
	private String originalFileExtension = null;
	private String storeFile = null;
	private String path = null;

	
	//레스토랑 등록
	public Integer restaurantRegist(RestaurantRegisterCommand reCommand, HttpServletRequest request, Model model) {
		Integer result = 0;
		String area=reCommand.getAddress().substring(0,2);
		String address=reCommand.getAddress()+" "+reCommand.getDetailAddress();
		String tell = reCommand.getRestaurantTell()[0]+reCommand.getRestaurantTell()[1]+reCommand.getRestaurantTell()[2];

		String filePath = request.getRealPath("/WEB-INF/view/")+"Restaurant\\upfile\\";
		MultipartFile report = reCommand.getRestaurantImage();
		originalFile = report.getOriginalFilename();
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

		RestaurantDTO redto = new RestaurantDTO (reCommand.getRestaurantName(),reCommand.getRestaurantKind(),address,area,originalFile,storeFile,tell,reCommand.getRestaurantInfo(),reCommand.getTableCount());

		result=restaurantRepository.insertRestaurant(redto);

		model.addAttribute("redto", redto);
		return result;

	}

	//레스토랑 리스트
	public List<RestaurantDTO> restaurantList(Model model) {
		List<RestaurantDTO> list = restaurantRepository.restaurantList();
		model.addAttribute("list",list);
		return list;

	}



	//레스토랑 디테일
	public void restaurantDetail(Model model, Long num) {
		RestaurantDTO rdto = restaurantRepository.restaurantDedail(num);
		model.addAttribute("rdto",rdto);


	}

	//레스토랑 종류별 리스트
	public void restaurantList(Model model, String kind) {
		List<RestaurantDTO> list = restaurantRepository.restaurantList(kind);
		model.addAttribute("list",list);
		model.addAttribute("kind",kind);
	}

	//레스토랑 지역별 리스트
	public void restaurantArea(Model model, String area, String kind) {
		List<RestaurantDTO> list = restaurantRepository.restaurantArea(area, kind);

		model.addAttribute("list",list);

	}

	//신규등록순 리스트
	public void newRestaurant(Model model, String kind) {
		List<RestaurantDTO> list = restaurantRepository.newRestaurant(kind);

		model.addAttribute("list",list);

	}

	//음식세트 등록
	public String foodInsert(Model model, FoodCommand fCommand, HttpServletRequest request) {

		String filePath = request.getRealPath("/WEB-INF/view/")+"Product\\date\\";
		MultipartFile report = fCommand.getFoodImage();

		System.out.println(request.getRealPath("/WEB-INF/view/")+"Product\\date\\");
		originalFile = report.getOriginalFilename();
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

		FoodDTO fdto = new FoodDTO(fCommand.getNum(),fCommand.getFoodPrice(),originalFile,storeFile,fCommand.getFoodInform(),
				fCommand.getFoodName(),fCommand.getFoodType());

		Integer i1;


		fdto.setFoodNum(restaurantRepository.dateProductNum());
		restaurantRepository.dateProduct(fdto);

		i1=restaurantRepository.foodInsert(fdto);

	
		return	path ="RegisterComplete";



	}

	//페이징
	public int listCount() {
		// TODO Auto-generated method stub
		return restaurantRepository.ListCount();
	}


	public List<RestaurantDTO> listpaging(AutoPaging paging) {
		// TODO Auto-generated method stub
		return restaurantRepository.paging(paging);
	}

	//레스토랑 상세페이지 안에 음식세트 리스트
	public void foodList(Model model, Long num) {

		List<FoodDTO> list = restaurantRepository.foodList(num);

		model.addAttribute("list",list);
		
		
	}

	//음식상세보기
	public void foodDetail(Model model, Long num) {
		FoodDTO fdto = restaurantRepository.foodDetail(num);
		model.addAttribute("fdto",fdto);
		
	}

	public void foodOrder(Model model, String foodName) {
		FoodDTO fdto = restaurantRepository.foodOrder(foodName);
		model.addAttribute("fdto",fdto);
		
	}



}






