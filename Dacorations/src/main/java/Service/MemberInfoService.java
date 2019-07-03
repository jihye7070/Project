package Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Commend.MemberUpdateCommand;
import Model.MemberDTO;
import Repository.MemberInfoRepository;
@Service
public class MemberInfoService {
	@Autowired
	private MemberInfoRepository memberInfoRepository;
	
	public MemberDTO info(String id) {
		// TODO Auto-generated method stub
		return memberInfoRepository.info(id);
		
	}

	public Integer update(MemberUpdateCommand upCommand, Model model) {
		// TODO Auto-generated method stub
		Integer result = 0;
		
		String tell;
		String area = upCommand.getAddress().substring(0,2);
		System.out.println(upCommand.getTell()[0]);
		tell=upCommand.getTell()[0]+upCommand.getTell()[1]+upCommand.getTell()[2];
		
		MemberDTO mdto = new MemberDTO();
		mdto.setMemberId(upCommand.getId());
		mdto.setMemberName(upCommand.getName());
		mdto.setMemberPw(upCommand.getPassword());
		
		System.out.println("upCommand.getPassword : "+upCommand.getPassword());
		mdto.setMemberMail(upCommand.getEmail());
		mdto.setMemberTell(tell);
		mdto.setMemberAdd(upCommand.getAddress());
		mdto.setMemberArea(area);
		mdto.setMailConfrim(upCommand.getMailConfrim());
		result = memberInfoRepository.update(mdto);

		//System.out.println("왜 널이 뜨는 거니 왜왜왜왜오애ㅗ애ㅙ"+mdto.getPassChangeDate());

		model.addAttribute("mdto",mdto);
		return result;
	}

}
