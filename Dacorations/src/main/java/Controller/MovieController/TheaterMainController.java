package Controller.MovieController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import Service.TheaterMainService;

@Controller
public class TheaterMainController {
   @Autowired
	private TheaterMainService theaterMainService;
   
	
	@RequestMapping(value="/TheaterMain" ,method=RequestMethod.GET)
	public String main(Model model) {
		theaterMainService.movieList(model);
		return "Movie/MovieMain";
	}
	@RequestMapping(value="/TheaterList" ,method=RequestMethod.POST)
	public String theaterList(Model model,@RequestParam(value="area") String area,@RequestParam(value="kind") String kind) {
		theaterMainService.theaterList(model,area,kind);
		return "Movie/MovieMainAjax";
	}
	@RequestMapping(value="/TheaterScreenList" ,method=RequestMethod.POST)
	public String theaterScreenList(Model model,@RequestParam(value="num") Long num) {
		theaterMainService.theaterScreenList(model,num);
		
		return "Movie/MovieScreenAjax";
	}
	
	
	
	
}
