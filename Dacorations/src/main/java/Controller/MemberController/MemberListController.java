package Controller.MemberController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Service.MemberListService;

@Controller
public class MemberListController {
	
	@Autowired
	private MemberListService memberListService;
	
	public void setMemberListService(MemberListService memberListService) {
		this.memberListService = memberListService;
	}
	
	@RequestMapping(value="memberList", method=RequestMethod.GET)
	public String memberList(Model model) {
		memberListService.memberList(model);
		return "Member/MemberList";
	}

}
