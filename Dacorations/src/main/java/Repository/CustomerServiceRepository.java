package Repository;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;

import Commend.CustomerServiceCommand;
import Model.AnswerDTO;
import Model.ChargerDTO;
import Model.CustomerserviceDTO;

public class CustomerServiceRepository {
	@Autowired
	private SqlSession sqlSession;
	
	private final String namespace = "CustomerMapper";

	public Integer insert(CustomerserviceDTO dto) {
		// TODO Auto-generated method stub
		System.out.println("아이디"+dto.getMemberId());
		System.out.println("옵션"+dto.getBoardKind());
		System.out.println("내용"+dto.getBoardContent());
		System.out.println("제목"+dto.getBoardTitle());
		return sqlSession.insert("CustomerMapper.cinsert", dto);
	}

	public List<CustomerserviceDTO> alllist(CustomerserviceDTO dto) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("CustomerMapper.alllist", dto);
	}

	public CustomerserviceDTO detail(@RequestParam("fno") int num) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("CustomerMapper.detail", num);
	}

	public List<CustomerserviceDTO> notice(CustomerserviceDTO dto) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("CustomerMapper.noticelist", dto);
	}

	//답변
	public Integer answer(CustomerServiceCommand cus) {
		// TODO Auto-generated method stub
		return sqlSession.insert("CustomerMapper.answerinsert",cus);
	}
	//답변 리스트
	public AnswerDTO answerinfo(@RequestParam("fno") int num) {
		// TODO Auto-generated method stub
	
		return sqlSession.selectOne("CustomerMapper.answerselect", num);
	}

	public int answerupdate(Long chargeNum, Long boardNum) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("chargeNum", chargeNum);
		map.put("boardNum", boardNum);
		// TODO Auto-generated method stub
		return sqlSession.update("CustomerMapper.answerupdate", map);
	}



}
