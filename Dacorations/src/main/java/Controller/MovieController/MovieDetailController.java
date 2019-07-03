package Controller.MovieController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import Service.MovieDetailService;


@Controller
public class MovieDetailController {
	  @Autowired
			private MovieDetailService movieDetailService;
			
		        @RequestMapping(value="/movieDetail" ,method=RequestMethod.GET)
				public String form(Model model,@RequestParam(value="no") Long num,@RequestParam(value="img") String img) {
					
		        	movieDetailService.movieDetail(model,num,img);
		        	return "Movie/MovieDetail";
				}
		        @RequestMapping(value="/MovieSeat" ,method=RequestMethod.GET)
					public String seat(Model model,@RequestParam(value="num") Long num) {
						
//			        	movieDetailService.movieDetail(model,num);
			        	return "Movie/MovieDetail";
			    }
}