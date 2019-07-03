package Service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import com.sun.mail.iap.Response;

import Commend.LoginCommand;
import Model.ChargerDTO;
import Model.MemberDTO;
import Repository.LoginRepository;

public class LoginService {

	@Autowired
	private LoginRepository loginRepository;





	public void chkLogin(LoginCommand loginCommand, Model model,HttpSession session) {

		Integer result = 0;
		MemberDTO logindto = loginRepository.login(loginCommand.getId());
		
		if(logindto == null	) {
			System.out.println("아이디가 존재하지 않습니다.");
			result=0;
		} 
		else if(!logindto.getMemberPw().equals(loginCommand.getPassword())) {
			System.out.println(logindto.getMemberPw()+"비밀번호가 일치하지 않습니다."+loginCommand.getPassword());
			result=1;

		}
		else {
			
			loginRepository.last(loginCommand.getId());
			System.out.println(logindto.getMemberLastDate());
			System.out.println(logindto.getMemberTell());
			

			session.setAttribute("memberDTO", logindto);
			result=2;	

		}
		model.addAttribute("result",result );
	}



	public void c_chkLogin(LoginCommand loginCommand, Model model, HttpSession session) {
		// TODO Auto-generated method stub
		Integer result = 0;
		ChargerDTO logindto = loginRepository.clogin(loginCommand.getId());
		if(logindto == null	) {
			System.out.println("아이디가 존재하지 않습니다.");
			result=0;
		} 
		else if(!logindto.getChargePw().equals(loginCommand.getPassword())) {
			System.out.println(logindto.getChargePw()+"비밀번호가 일치하지 않습니다."+loginCommand.getPassword());
			result=1;

		}
		else {
			result=2;	
			int num = loginRepository.chargeNum(loginCommand.getId()).getChargeNum();
			ChargerDTO chargerDTO = new ChargerDTO();
			chargerDTO.setChargeId(loginCommand.getId());
			chargerDTO.setChargePw(loginCommand.getPassword());
			chargerDTO.setChargeNum(num);
			System.out.println("loginCommand"+loginCommand.getId());

			session.setAttribute("chargerDTO", chargerDTO);

		}
		model.addAttribute("result",result );

	}


}
