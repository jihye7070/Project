package Repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import Model.MemberDTO;

public class MemberListRepository {
	
	@Autowired
	private SqlSession sqlSession;
	private final String namespace = "MemberListMapper";
	
	public List<MemberDTO> memberList() {
		// TODO Auto-generated method stub
		
		
		return sqlSession.selectList("MemberListMapper.memberList");
		
		
	}

}
