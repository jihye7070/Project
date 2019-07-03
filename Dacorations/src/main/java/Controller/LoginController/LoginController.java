package Controller.LoginController;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Commend.LoginCommand;
import Service.LoginService;

//로그인 컨트롤러
@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value="/Login", method=RequestMethod.GET)//회원로그인
	public String login() {
		return "Login/Login";
	}

	@RequestMapping(value="/Login", method=RequestMethod.POST)
	public String logintry(Model model,LoginCommand loginCommand, HttpSession session) {


		loginService.chkLogin( loginCommand , model,session);
		
		return "redirect:/Main";
	}

	
	
	@RequestMapping(value="/Logout", method=RequestMethod.GET)//로그아웃
	public String logout(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.invalidate();
		return "redirect:/Main";
	}
	
	
	@RequestMapping(value="/CLogin", method=RequestMethod.GET)//담당자 로그인
	public String Clogin() {
		return "Login/C_Login";
	}
	

	@RequestMapping(value="/CLogin", method=RequestMethod.POST)
	public String logintrytry(Model model,LoginCommand loginCommand, HttpSession session) {

		loginService.c_chkLogin( loginCommand , model,session);
		return "redirect:/Main";
	}
}
