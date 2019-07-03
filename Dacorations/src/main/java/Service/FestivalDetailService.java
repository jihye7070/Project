package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import Commend.OptionCommand;
import Model.FestivalDTO;
import Model.OptionDTO;
import Repository.FestivalRepository;
@Service
public class FestivalDetailService {
	@Autowired
	private FestivalRepository festivalRepository;
	
	public FestivalDTO detail(@RequestParam("fno") int num) {
		return  festivalRepository.detail(num);
	}

	

	

	
	

}
