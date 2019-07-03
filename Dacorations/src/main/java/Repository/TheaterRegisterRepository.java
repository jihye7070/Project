package Repository;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import Model.DateMovieDTO;
import Model.DateProductMovieDTO;
import Model.RestaurantDTO;
import Model.ScreenDTO;
import Model.TheaterRegisterDTO;

public class TheaterRegisterRepository {
	@Autowired
	private SqlSession sqlSession;
	
	
	
	public Integer insertTheater(TheaterRegisterDTO tRdto) {
        return sqlSession.insert("TheaterMapper.insertTheater",tRdto);
	}
	public List<TheaterRegisterDTO> listTheater(String area,String kind) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("area", area);
		map.put("kind", kind);
		return sqlSession.selectList("TheaterMapper.listTheater",map);
	}
	public TheaterRegisterDTO screenList(Long num) {
	
		return sqlSession.selectOne("TheaterMapper.screenList",num);
	}
	public List<DateMovieDTO> screenMovie(Long num) {
		
		return sqlSession.selectList("TheaterMapper.screenMovie",num);
	}
	public List<TheaterRegisterDTO> theaterList() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("TheaterMapper.theaterList");
	}
	public List<DateProductMovieDTO> movieScreentimes(Long no,Long tno) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("no", no);
		map.put("tno", tno);
		return sqlSession.selectList("TheaterMapper.movieScreentimes",map);
	}
	public Long movieTimeSeat(String time,Long tnum,int snum) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		
		map.put("time",time);
		map.put("tnum", tnum);
		map.put("snum", snum);
		
		System.out.println(time+"  시간");
		return sqlSession.selectOne("TheaterMapper.movieTimeSeat",map);
	}
	
}
