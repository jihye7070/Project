package Controller.MovieController;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Commend.MovieRegisterCommand;
import Commend.TheaterRegisterCommend;
import Service.MovieRegisterService;
import Service.TheaterRegisterService;

@RequestMapping("/MovieRegister")
@Controller
public class MovieRegisterController {
	
	    @Autowired
		private MovieRegisterService movieRegisterService;
		
	        @RequestMapping(method=RequestMethod.GET)
			public String form() {
				return "Movie/MovieForm";
			}
			
			@RequestMapping(method=RequestMethod.POST)
			public String submit(Model model,MovieRegisterCommand mRcommand,HttpServletRequest request ) {
				
				String path=movieRegisterService.movieInsert(model,mRcommand,request);
				System.out.println(path);
				return path;
			}
			
			
			
		
}