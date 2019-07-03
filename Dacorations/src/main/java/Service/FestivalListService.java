package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Model.FestivalDTO;
import Repository.FestivalRepository;
import other.AutoPaging;
@Service
public class FestivalListService {

	@Autowired
	private FestivalRepository festivalRepository;
	
	/*public List<FestivalDTO> festivallist(FestivalDTO dto) {
		// TODO Auto-generated method stu
		return festivalRepository.festivallist(dto);
	}*/

	public int listCount() {
		// TODO Auto-generated method stub
		return festivalRepository.ListCount();
	}

	public List<FestivalDTO> listpaging(AutoPaging paging) {
		// TODO Auto-generated method stub
		return festivalRepository.paging(paging);
	}

	public List<FestivalDTO> area(String FESTIVALAREA) {
		if(FESTIVALAREA.equals("")) FESTIVALAREA=null;
		return  festivalRepository.area(FESTIVALAREA);
	}

	public List<FestivalDTO> areapaging(AutoPaging paging) {
		// TODO Auto-generated method stub
		return festivalRepository.areapaging(paging);
	}

	public int arealistCount() {
		// TODO Auto-generated method stub
		return festivalRepository.pagingListCount();
	}


}
