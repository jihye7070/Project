package Repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.ChargerDTO;
import Model.MemberDTO;

@Repository
public class LoginRepository {
	@Autowired
	private SqlSession sqlSession;
	private final String namespace = "LoginMapper";
	
	public MemberDTO login(String id) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("LoginMapper.login", id);
	}

	public ChargerDTO clogin(String id) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("LoginMapper.clogin", id);
	}

	
	public MemberDTO last(String id) {
		return sqlSession.selectOne("LoginMapper.last", id);
		
	}

	public ChargerDTO chargeNum(String id) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("LoginMapper.chargerno", id);
		
	}


}
