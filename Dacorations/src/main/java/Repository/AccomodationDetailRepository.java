package Repository;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import Model.AccomodationDTO;
import Model.AccomodationRegisterDTO;

public class AccomodationDetailRepository {
	@Autowired
	private SqlSession sqlSession;
	private final String namespace = "AccomodationMapper";

	//등록된 객실상품을 리스트로 출력하기위해 
	public List<AccomodationRegisterDTO> accomodationRoomList(Long num) {
		return sqlSession.selectList("AccomodationMapper.AccomodationRoomList",num);
	}
	//객실이 등록될때 부모테이블인 데이트상품넘버 값을 가져오기위해
	public Long dateProductNum() {
		return sqlSession.selectOne("AccomodationMapper.DateProductNum");
	}
	//객실이 등록될때 부모테이블 데이트상품넘버에 값을 넣기위해
	public int dateProduct(AccomodationRegisterDTO aRdto) {
		return sqlSession.insert("AccomodationMapper.DateProduct",aRdto);
	}
	//객실상품을을 등록하기위해
	public int roomRegister(AccomodationRegisterDTO aRdto) {
		return sqlSession.insert("AccomodationMapper.AccomodationRegister",aRdto);
	}	
	//디테일페이지에서 선택된 숙박의 정보를 출력하기위해서
	public AccomodationDTO accomodationRoom(Long num) {
		return sqlSession.selectOne("AccomodationMapper.AccomodationRoom",num);
	}
	//각각의 숙소의 평균 객실 가격을 가져오기위한
	public Long accomodationAvg(Long num) {
		return sqlSession.selectOne("AccomodationMapper.AccomodationAvg",num);
	}
	//각각의 숙소의 평균 객실 가격을 해당 숙소에 넣기위한
	public int accomodationAvgInsert(Long num,Long avg) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("num", num);
		map.put("avg", avg);
		
		return sqlSession.update("AccomodationMapper.AccomodationAvgInser",map);
    }

}
