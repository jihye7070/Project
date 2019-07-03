package Controller.MovieController;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import Commend.MovieScreenCommand;
import Commend.ScreenCommand;
import Model.DateMovieDTO;
import Service.ScreenRegisterService;

@Controller
public class ScreenController {
    @Autowired
	private ScreenRegisterService screenRegisterService;
	
	
	@RequestMapping(value="/ScreenRagister" ,method=RequestMethod.POST)
	public String theaterList(Model model,ScreenCommand sCommand,HttpServletRequest request) {
	String path=screenRegisterService.screenInsert(sCommand,request);
		
		return path;
	}
	
	@RequestMapping(value="/MovieRegisterIntoScreen" ,method=RequestMethod.GET)
	public String intoScreen(Model model ,@RequestParam(value="no1") Long no1,@RequestParam(value="no2") Long no2) {
		screenRegisterService.intoScreen(model,no1,no2);
		
		return "Movie/MoviceScreenInsert";
	}
	@RequestMapping(value="/MovieScreen" ,method=RequestMethod.POST)
	public String movieScreen(Model model,MovieScreenCommand mScommand) {
		String path=screenRegisterService.movieScreenRegister(mScommand);
		
		return  path;
	}
	@RequestMapping(value="/MovieSeatChoice" ,method=RequestMethod.GET)
	public String Screen(Model model ,@RequestParam(value="no1") Long movienum,
			@RequestParam(value="no2") int column,@RequestParam(value="no22") int row,@RequestParam(value="no3") int price,
			@RequestParam(value="no4") String img,@RequestParam(value="no5") Long sNum,
			@RequestParam(value="no6") String titel,@RequestParam(value="no7") String sName,
			@RequestParam(value="no8") Long tNum
			) {
		DateMovieDTO dDto =new DateMovieDTO();
		dDto.setMoviePrice(price);dDto.setMovieStoreimg(img);
		dDto.setMovieTitel(titel);dDto.setScreenName(sName);
		dDto.setScreenRow(row);dDto.setScreenColumn(column);
	screenRegisterService.movieScreentimes(sNum,tNum,dDto,model);
	
		return "Movie/MovieSeat";
	}
	@RequestMapping(value="/TimeSeat" ,method=RequestMethod.POST)
	public String TimeSeat(Model model ,@RequestParam(value="time") String time,
			@RequestParam(value="snum") int snum,@RequestParam(value="tnum") Long tnum) {
		System.out.println("뭐지");
	screenRegisterService.movieTimeSeat(time,tnum,snum,model);
	
		return "Movie/MovieSeatTime";
	}
	
}
