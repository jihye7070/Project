package Repository;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import Model.AccomodationDTO;
import Model.AccomodationRegisterDTO;
import Model.MemberDTO;

public class AccomodationRepository {
	@Autowired
	private SqlSession sqlSession;
	private final String namespace = "AccomodationMapper";

	//숙박을 등록하기위한 
	public Integer insertAccomodation(AccomodationDTO aDto) {
		return sqlSession.insert("AccomodationMapper.insertAccomodation", aDto);
	}
	//등록된 숙박을 리스트로 출력하기위한
	public List<AccomodationDTO> listAccomodation() {
		return sqlSession.selectList("AccomodationMapper.listAccomodation");
	}
	//종류별로 등록된 숙박수를 메인에서 확인하기위한
	public List<AccomodationDTO> listAccomodationCount() {
		return sqlSession.selectList("AccomodationMapper.listAccomodationCount");

	}
	//종류별로 숙박 리스트를 출력하기위한
	public List<AccomodationDTO> listEachAccomodation(String kind) {
		return sqlSession.selectList("AccomodationMapper.listEachAccomodationCount",kind);

	}
	//종류별로 등록된 숙박수를 디테일 페이지에서 확인하기위한
	public AccomodationDTO accomodationCount(String kind) {
		return sqlSession.selectOne("AccomodationMapper.AccomodationCount",kind);

	}
	public List<AccomodationDTO> accomodationArea(String area,String kind) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("area", area);
		map.put("kind", kind);

		return sqlSession.selectList("AccomodationMapper.AccomodationArea",map);

	}
	public List<AccomodationDTO> accomodationPrice(String kind) {

		return sqlSession.selectList("AccomodationMapper.AccomodationPrice",kind);

	}
	public List<AccomodationDTO> accomodationLowPrice(String kind) {

		return sqlSession.selectList("AccomodationMapper.AccomodationLowPrice",kind);

	}
	
}