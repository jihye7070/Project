package Repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import Model.AccomodationDTO;
import Model.FestivalDTO;
import Model.MovieRegisterDTO;
import Model.RestaurantDTO;

public class MainRepository {

	@Autowired
	private SqlSession sqlSession;
	
	public List<RestaurantDTO> restaturantList() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("MainMapper.restaturantList");
	}

	public List<AccomodationDTO> accomodationList() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("MainMapper.accomodationList");
	}

	public List<MovieRegisterDTO> movieList() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("MainMapper.movieList");
	}

/*	public List<FestivalDTO> festivalList() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("MainMapper.festivalList");
	}*/

}
