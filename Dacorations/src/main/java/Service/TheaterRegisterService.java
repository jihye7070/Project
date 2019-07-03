package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import Commend.TheaterRegisterCommend;
import Model.AccomodationDTO;
import Model.AccomodationRegisterDTO;
import Model.TheaterRegisterDTO;
import Repository.TheaterRegisterRepository;

public class TheaterRegisterService {
    @Autowired
	private TheaterRegisterRepository theaterRegisterRepository;
	
    public void theaterRegister(Model model,TheaterRegisterCommend tRcommend) {
//		String theaterName, String theaterAdd, String theaterArea, String theaterTell,
//		String theaterKind
    	System.out.println(tRcommend.getTheaterName()+"tRcommend.getTheaterName()");
		String area=tRcommend.getAddress().substring(0,2);
		String address=tRcommend.getAddress()+" "+tRcommend.getAddressDetail();
		System.out.println(tRcommend.getTell()[0]+"안들어왔나");
		String tell=tell=tRcommend.getTell()[0]+"-"+tRcommend.getTell()[1]+"-"+tRcommend.getTell()[2];
		TheaterRegisterDTO tRdto = new TheaterRegisterDTO(tRcommend.getTheaterName(),address,area,tell,tRcommend.getTheaterKind());
	    Integer i=theaterRegisterRepository.insertTheater(tRdto);
	
		
	}

}
