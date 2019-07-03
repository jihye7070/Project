package Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import Model.MovieRegisterDTO;
import Repository.MovieDetailRepository;

public class MovieDetailService {
    @Autowired
	private MovieDetailRepository movieDetailRepository;
      public void movieDetail(Model model,Long no,String img) {
    	  
    	  MovieRegisterDTO mRdto=movieDetailRepository.movieDetail(no);
    	  
    	  model.addAttribute("mRdto", mRdto);
    	  model.addAttribute("img", img);
      }
	
}
