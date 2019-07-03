package Controller.FestivalController;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import Model.FestivalDTO;
import Service.FestivalDetailService;


@Controller
public class FestivalDetailController {
	// 축제 디테일 컨트롤러
		@Autowired
		private FestivalDetailService festivalDetailService;
	
		public FestivalDetailController(FestivalDetailService festivalDetailService) {
			this.festivalDetailService = festivalDetailService;
		}

		@RequestMapping(value="/FestivalDetail", method = RequestMethod.GET )
		public String form(Model model,@RequestParam("fno") int num) {
			FestivalDTO Festivaldetail = festivalDetailService.detail(num);
			model.addAttribute("Festivaldetail", Festivaldetail);
			return "Festival/FestivalDetail";
		}
		
	
		
}
