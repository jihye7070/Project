package Repository;


import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.MemberDTO;

@Repository
public class MemberSessionRepository {
	@Autowired
	private SqlSession sqlSession;
	private final String namespace = "MemberMapper";

	
	public Integer insertMember(MemberDTO mDto) {
		System.out.println(mDto.getMailConfrim()+mDto.getMemberAdd()+mDto.getMemberGender());
		return sqlSession.insert("MemberMapper.insertMember", mDto);
	}
	
	public MemberDTO duplicate(String id) {
	
		return sqlSession.selectOne("MemberMapper.selectDuplicate",id);
	}
	
}
