package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import Model.DateMovieDTO;
import Model.MovieRegisterDTO;
import Model.ScreenDTO;
import Model.TheaterRegisterDTO;
import Repository.MovieRegistRepository;
import Repository.ScreenRegisterRepository;
import Repository.TheaterRegisterRepository;

public class TheaterMainService {

	@Autowired
	private TheaterRegisterRepository theaterRegisterRepository;
	@Autowired
	private MovieRegistRepository movieRegistRepository;
	@Autowired
	private ScreenRegisterRepository screenRegisterRepository;
	public void theaterList(Model model,String area,String kind) {

	List<TheaterRegisterDTO> list=theaterRegisterRepository.listTheater(area, kind);
	model.addAttribute("list",list);
	}
	public void theaterScreenList(Model model,Long num) {
  
	TheaterRegisterDTO tRdto=theaterRegisterRepository.screenList(num);
	List<DateMovieDTO> dMdto=theaterRegisterRepository.screenMovie(num);
	List<ScreenDTO> sList=screenRegisterRepository.screenList(num);
	
	model.addAttribute("tRdto",tRdto);
	model.addAttribute("sList",sList);
	model.addAttribute("dMdto",dMdto);
	System.out.println(num+"뭐지");
	model.addAttribute("num",num);
	}
	public void movieList(Model model) {

		List<MovieRegisterDTO> Mrdto=movieRegistRepository.movieList();
		
		model.addAttribute("Mrdto",Mrdto);
		}
	public List<TheaterRegisterDTO> theaterList(Model model) {
		List<TheaterRegisterDTO> list =theaterRegisterRepository.theaterList();
		
		
		return list;
	}
	
	
}
