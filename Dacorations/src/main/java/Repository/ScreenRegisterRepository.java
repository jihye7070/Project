package Repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import Model.DateProductMovieDTO;
import Model.ScreenDTO;

public class ScreenRegisterRepository {
	@Autowired
	private SqlSession sqlSession;
	
	public Integer screenInsert(ScreenDTO sDto) {
        return sqlSession.insert("ScreenMapper.screenInsert",sDto);
	}
	
	public List<ScreenDTO> screenList(Long no) {
        return sqlSession.selectList("ScreenMapper.screenLists",no);
	}
	public Integer screenMovieInsert(DateProductMovieDTO dPdto) {
        return sqlSession.insert("ScreenMapper.screenMovieInsert",dPdto);
	}
	
	
}
