package Service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import Commend.MemberRegisterCommend;
import Model.MemberDTO;
import Repository.MemberSessionRepository;



public class MemberService {

	@Autowired
	private MemberSessionRepository memberSessionRepository;	

	//MemberInsert 메소드
	public Integer Memberinsert(MemberRegisterCommend mCommend,Model model) {
		Integer result = 0;
		//배열로 받아온 커맨드객체 tell을 받기위한 변수
		String tell;

		//커맨드객체 Address에서 지역 부문 데이터만 추출하기위한 변수
		String area=mCommend.getAddress().substring(0, 2);

		//커맨드객체에 저장된 데이터값을 MemberDTO에 저장
		tell=mCommend.getTell()[0]+mCommend.getTell()[1]+mCommend.getTell()[2];
		MemberDTO mDto = new MemberDTO(mCommend.getId(),mCommend.getPassward(),tell,mCommend.getGender(),
				mCommend.getEmail(),mCommend.getAddress(),area,mCommend.getMailConfrim(),mCommend.getName());

		//데이터가 저장이 완료된 MemberDTO를 인자값으로 memberSessionRepository.insertMember에 전달함
		result =memberSessionRepository.insertMember(mDto);

		model.addAttribute("mDto",mDto);
		return result;
	}

	
	public Integer duplicate(String id,Model model) {
		Integer result = 0;
		MemberDTO member =memberSessionRepository.duplicate(id);
		
		if(member != null) {
			result = 1;
		}else {
			result = 0;
		}
        System.out.println(result+"과연");
		model.addAttribute("result", result);

		return result;
	}

}
