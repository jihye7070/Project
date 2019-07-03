package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import Model.MemberDTO;
import Repository.MemberListRepository;

public class MemberListService {

	@Autowired
	private MemberListRepository memberListRepository;
	
	public void memberList(Model model) {
		List<MemberDTO> members = memberListRepository.memberList();
		model.addAttribute("members",members);
		
	}

}
