package Repository;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

public class DateProductRepository {
	    @Autowired
	    private SqlSession sqlSession; 
	    //객실이 등록될때 부모테이블인 데이트상품넘버 값을 가져오기위해
		public Long dateProductNum() {
			System.out.println("여기");
			return sqlSession.selectOne("DateProducts.DateProductNums");
		}
		//객실이 등록될때 부모테이블 데이트상품넘버에 값을 넣기위해
		public int dateProduct(Long num,int nums) {
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("num", num);
			map.put("nums", nums);
			return sqlSession.insert("DateProducts.DateProduct",map);
		}
		

}
