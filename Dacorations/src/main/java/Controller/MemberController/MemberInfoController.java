package Controller.MemberController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Commend.MemberUpdateCommand;
import Model.MemberDTO;
import Service.MemberInfoService;

@Controller
public class MemberInfoController {

	@Autowired
	private MemberInfoService memberInfoService;

	public void setMemberInfoService(MemberInfoService memberInfoService) {
		this.memberInfoService = memberInfoService;
	}
	
	@RequestMapping(value="MemberInfo", method=RequestMethod.GET)
	public String info(HttpServletRequest request, Model model) {
		HttpSession session = request.getSession();
		MemberDTO mem  = (MemberDTO) session.getAttribute("memberDTO");
		String id = mem.getMemberId();
		System.out.println(id);
		MemberDTO mm = memberInfoService.info(id); 
		
		System.out.println(mm.getPassChangeDate());
		
		System.out.println(mem.getMemberName()+"멤버이름");
		model.addAttribute("mem",mm);
		
		
		return "Member/MemberInfo";
	}
	
	@RequestMapping(value= "MemberUpdate", method=RequestMethod.GET)
	public String update() {
		
		return "Member/MemberUpdate";
	}
	@RequestMapping(value= "MemberUpdate", method=RequestMethod.POST)
	public String info_update(MemberUpdateCommand upCommand, Model model ) {
		
		memberInfoService.update(upCommand,model);
		return "Member/MemberUpdate";
	}
}
