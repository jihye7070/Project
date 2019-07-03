package Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import Commend.OptionCommand;
import Model.FestivalDTO;
import Model.OptionDTO;
import other.AutoPaging;
@Repository
public class FestivalRepository {
	@Autowired
	private SqlSession sqlSession;
	private final String namespace = "FestivalMapper";
	
	
	public List<FestivalDTO> festivallist(FestivalDTO dto) {
		return sqlSession.selectList("FestivalMapper.selectlist",dto);

	}

	public FestivalDTO detail(@RequestParam("fno") int num) {
		return sqlSession.selectOne("FestivalMapper.detail",num);
	}


	public int ListCount() {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("FestivalMapper.listcount");
	}


	public List<FestivalDTO> paging(AutoPaging paging) {
		Integer minNum = ((paging.getPage()-1)*paging.getLimit())+1;
		Integer maxNum = minNum+paging.getLimit()-1;
		HashMap<String, Object> mapping = new HashMap<String, Object>();
		mapping.put("minNum", minNum);
		mapping.put("maxNum", maxNum);
		return sqlSession.selectList("FestivalMapper.paging",mapping);
	}


	public List<FestivalDTO> area(String FESTIVALAREA) {
		// TODO Auto-generated method stub
		Map <String, String> map = new HashMap<String, String>();
		map.put("festivalarea", FESTIVALAREA);
		return sqlSession.selectList("FestivalMapper.selectfestivalarea",map);
	}


	public List<FestivalDTO> areapaging(AutoPaging paging) {
		Integer minNum = ((paging.getPage()-1)*paging.getLimit())+1;
		Integer maxNum = minNum+paging.getLimit()-1;
		HashMap<String, Object> areamapping = new HashMap<String, Object>();
		areamapping.put("minNum", minNum);
		areamapping.put("maxNum", maxNum);
		return sqlSession.selectList("FestivalMapper.areapaging",areamapping);
	}


	public int pagingListCount() {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("FestivalMapper.paginglistcount");
	}

	
	







	
	



}
