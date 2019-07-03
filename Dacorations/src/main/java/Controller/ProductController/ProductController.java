package Controller.ProductController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import Model.AccomodationDTO;
import Model.ProductDTO;
import Model.RestaurantDTO;
import Model.TheaterRegisterDTO;
import Service.AccomodationService;
import Service.RestaurantService;
import Service.TheaterMainService;

@Controller
public class ProductController {
	@Autowired
	private AccomodationService accomodationService;
	@Autowired
	private TheaterMainService theaterMainService;
	@Autowired
	RestaurantService restaurantService;
	
	



	@RequestMapping(value="/Product" ,method=RequestMethod.GET)
	public String list() {

		return "Product/ProductList";
	}


	@RequestMapping(value="/Productkind", method=RequestMethod.GET)
	public String product(Model model,@RequestParam(value="kind") String kind) {
      
		if(kind.equals("숙소")) {
			List<ProductDTO> pDtos= new ArrayList <ProductDTO>();
			List<AccomodationDTO> dto=accomodationService.accomodationList(model);
			for(int i=0; i<dto.size(); i++) {
				pDtos.add(new ProductDTO(dto.get(i).getAccomodationName(),
						dto.get(i).getAccomodationInform(),dto.get(i).getAccomodationAdd()
						,dto.get(i).getAccmodationTell()));
			}
              System.out.println(pDtos.size()+"사이즈");
			model.addAttribute("pDtos",pDtos);
		
           
		}else if(kind.equals("영화")) {
			List<ProductDTO> pDtos= new ArrayList <ProductDTO>();
			List<TheaterRegisterDTO> dto = theaterMainService.theaterList(model);
			for(int i=0; i<dto.size(); i++) {
				pDtos.add(new ProductDTO(dto.get(i).getTheaterName(),
						dto.get(i).getTheaterKind(),dto.get(i).getTheaterAdd()
						,dto.get(i).getTheaterTell()));
			}
			
			model.addAttribute("pDtos",pDtos);
			
		}else if(kind.equals("레스토랑")) {
			List<ProductDTO> pDtos= new ArrayList <ProductDTO>();
			List<RestaurantDTO> dto = restaurantService.restaurantList(model);
			for(int i=0; i<dto.size(); i++) {
				pDtos.add(new ProductDTO(dto.get(i).getRestaurantName(),
						dto.get(i).getRestaurantInfo(),dto.get(i).getRestaurantAdd()
						,dto.get(i).getRestaurantTell()));
			}
			
			model.addAttribute("pDtos",pDtos);
			
			
		}

		
		
		
		return "Product/ProductListAjax";
	}
}
