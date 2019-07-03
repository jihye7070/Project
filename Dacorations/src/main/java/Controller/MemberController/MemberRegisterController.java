package Controller.MemberController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import Commend.MemberRegisterCommend;
import Service.MemberService;


//회원 등록 컨트롤러

@Controller
public class MemberRegisterController {

	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value="/MemberRegister" ,method=RequestMethod.GET)
	public String form() {
	
		return "Member/MemberRegister";
	}
	
	@RequestMapping(value="/MemberJoin",method = RequestMethod.POST)
	public String submit(Model model,MemberRegisterCommend mCommend) { 

		memberService.Memberinsert(mCommend,model);
		return "Member/MemberRegisterSuccess";
	}
	
	@RequestMapping(value="/MemberDuplicate" , method = RequestMethod.POST)
	public String duplicate(Model model,@RequestParam(value="id") String id	)  { 
		memberService.duplicate(id,model);
		System.out.println(id+"뭐지");
		return "Member/MemberDuplicateCheck";
	}
}
