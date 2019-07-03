package Repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import Model.MovieRegisterDTO;

public class MovieDetailRepository {
	 @Autowired
	private SqlSession sqlSession;
	 
	 public MovieRegisterDTO movieDetail(Long no) {
		Long num=no;
		 return sqlSession.selectOne("MovieMapper.movieDetail",num);
		}
}
