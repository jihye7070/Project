package Controller.RestaurantController;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import Commend.FoodCommand;
import Commend.PagingCommand;
import Commend.RestaurantOptionCommand;
import Commend.RestaurantRegisterCommand;
import Model.RestaurantDTO;
import Service.RestaurantService;
import other.AutoPaging;

@Controller
public class RestaurantRegisterController {

	@Autowired
	RestaurantService restaurantService;
	
	//메인페이지
	@RequestMapping(value="/RestaurantMain" ,method=RequestMethod.GET)
	public String main(Model model,RestaurantDTO dto,@ModelAttribute PagingCommand command) {
		
		if(command.getPage()==0) {
            command.setPage(1);
          }
		AutoPaging paging = new AutoPaging(command.getPage(),3,3);
		paging.setListCount(restaurantService.listCount());
		List<RestaurantDTO> listpaging = restaurantService.listpaging(paging);
		model.addAttribute("list", listpaging);
		model.addAttribute("paging", paging);
		restaurantService.restaurantList(model);
		return "Restaurant/RestaurantMain";
	}

	
	//등록
	@RequestMapping(value="/RestaurantRegister", method=RequestMethod.GET)
	public String regist() {
		
		return "Restaurant/RestaurantRegister";
	}
	
	@RequestMapping(value="/RestaurantRegister", method=RequestMethod.POST)
	public String submit(RestaurantRegisterCommand reCommand ,HttpServletRequest request, Model model) {
		
		restaurantService.restaurantRegist(reCommand, request, model);
		return "redirect:/Reg_Link";
	}
	
	//레스토랑 디테일
	
	@RequestMapping(value="/RestaurantDetail", method=RequestMethod.GET)
	public String detailrest(Model model, @RequestParam(value="num") Long num) {
		
		restaurantService.restaurantDetail(model, num);
		restaurantService.foodList(model, num);
		return "Restaurant/RestaurantDetail";
	}
	
	
	//레스토랑 종류별 
	
	@RequestMapping(value="/RestaurantList" ,method=RequestMethod.GET)
	public String restaurantList(Model model,@RequestParam(value="kind") String kind
			) {
		restaurantService.restaurantList(model,kind);
		
		return "Restaurant/RestaurantList";
	}
	
	
	//레스토랑 지역별 나누기
	@RequestMapping(value="/RestaurantKind" ,method=RequestMethod.POST)
	public String detailArea(Model model,@RequestParam(value="area") String area,
			@RequestParam(value="kind") String kind) {
		restaurantService.restaurantArea(model,area,kind);
		
		return "Restaurant/RestaurantAjax";
	}
	
	
	@RequestMapping(value="/RestaurantNew" ,method=RequestMethod.POST)
	public String newRestaurant(Model model,@RequestParam(value="kind") String kind ) {
		restaurantService.newRestaurant(model, kind);
		
		return "Restaurant/RestaurantAjax";
	}
		
	
	
	//음식(세트) 등록
	@RequestMapping(value="/FoodRegister", method=RequestMethod.GET)
	public String foodinsert(Model model, @RequestParam(value="num") int num) {
		
		model.addAttribute("num", num);
		return "Restaurant/FoodRegister";
	}
	
	@RequestMapping(value="/FoodRegister", method=RequestMethod.POST)
	public String insert(Model model, HttpServletRequest request, FoodCommand fCommand) {
		
		String path=restaurantService.foodInsert(model,fCommand,request);
		return path;
	}
	
	//음식세트 디테일
	
	@RequestMapping(value="/FoodDetail", method=RequestMethod.GET)
	public String foodDetail(Model model, @RequestParam(value="num") Long num) {
		
		restaurantService.foodDetail(model, num);
		return "Restaurant/FoodDetail";
	}
	
	//음식 예약 페이지 "foodOrder"
	
	@RequestMapping(value="/FoodOrder", method=RequestMethod.POST)
	public String foodOrder(Model model,@ModelAttribute  RestaurantOptionCommand command) {
		model.addAttribute("command", command);
		restaurantService.foodOrder(model, command.getFoodName());
		
		return "Restaurant/FoodOrder";
	}

	
	
}
