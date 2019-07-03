package Repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import Model.MovieRegisterDTO;

public class MovieRegistRepository {
    @Autowired
	private SqlSession sqlSession;

		public Integer movieInsert(MovieRegisterDTO art) {
			
			return sqlSession.insert("MovieMapper.insertMovie",art);
		}
		public List<MovieRegisterDTO> movieList() {
			return sqlSession.selectList("MovieMapper.movieList");
		}
			
	}


