package Repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.MemberDTO;
@Repository
public class MemberInfoRepository {

	@Autowired
	private SqlSession sqlSession;
	private final String namespace = "MemberInfoMapper";
	
	public MemberDTO info(String id) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("MemberInfoMapper.memberInfo", id);
	}

	public Integer update(MemberDTO mdto) {
		// TODO Auto-generated method stub
		return sqlSession.update("MemberInfoMapper.memberUpdate", mdto);
	}

}
