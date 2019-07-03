package Controller.MovieController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Commend.TheaterRegisterCommend;
import Service.TheaterRegisterService;
@RequestMapping("/TheaterRegister")
@Controller
public class TheaterRegisterController {
    @Autowired
	private TheaterRegisterService theaterRegisterService;
	
        @RequestMapping(method=RequestMethod.GET)
		public String form() {
			return "Movie/TheaterForm";
		}
		
		@RequestMapping(method=RequestMethod.POST)
		public String submit(Model model,TheaterRegisterCommend tRcommend ) {
			
			theaterRegisterService.theaterRegister(model,tRcommend);
			return "redirect:/TheaterMain";
		}
	}


