package Repository;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import Model.FoodDTO;
import Model.RestaurantDTO;
import other.AutoPaging;

public class RestaurantRepository {
	@Autowired
	private SqlSession sqlSession;
	
	
	//레스토랑 등록
	public Integer insertRestaurant(RestaurantDTO redto) {

		return sqlSession.insert("RestaurantMapper.insertRestaurant", redto);
	}


	//레스토랑 전체리스트
	public List<RestaurantDTO> restaurantList() {
		
		return sqlSession.selectList("RestaurantMapper.listRestaurant");
	}


	//레스토랑 디테일
	public RestaurantDTO restaurantDedail(Long num) {
		
		return sqlSession.selectOne("RestaurantMapper.detailRestaurant", num);
	}


	//레스토랑 종류별 리스트
	public List<RestaurantDTO> restaurantList(String kind) {
		
		return sqlSession.selectList("RestaurantMapper.listKindRestaurant", kind);
	}


	//레스토랑 지역별 리스트
	public List<RestaurantDTO> restaurantArea(String area, String kind) {
		HashMap<String, Object> map = new HashMap<String,Object>();
		map.put("area", area);
		map.put("kind", kind);
	
		return sqlSession.selectList("RestaurantMapper.restaurantArea", map);
	}


	//레스토랑 신규 등록순 리스트
	public List<RestaurantDTO> newRestaurant(String kind) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("RestaurantMapper.newRestaurant", kind);
	}


	//음식이 등록 될 때 부모테이블인 데이트 상품 넘버 값을 가져오기 위해
	public Long dateProductNum() {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("RestaurantMapper.DateProductNum");
	}


	//
	public int dateProduct(FoodDTO fdto) {
		return sqlSession.insert("RestaurantMapper.DateProduct",fdto);
		
	}


	//음식 등록
	public int foodInsert(FoodDTO fdto) {
		return sqlSession.insert("RestaurantMapper.foodInsert",fdto);
	}



	public int ListCount() {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("RestaurantMapper.listcount");
	}



	public List<RestaurantDTO> paging(AutoPaging paging) {
		Integer minNum = ((paging.getPage()-1)*paging.getLimit())+1;
		Integer maxNum = minNum+paging.getLimit()-1;
		HashMap<String, Object> mapping = new HashMap<String, Object>();
		mapping.put("minNum", minNum);
		mapping.put("maxNum", maxNum);
		return sqlSession.selectList("RestaurantMapper.paging",mapping);
	}


	//음식세트 리스트
	public List<FoodDTO> foodList(Long num) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("RestaurantMapper.foodList",num);
	}


	//음식 디테일
	public FoodDTO foodDetail(Long num) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("RestaurantMapper.foodDetail", num);
	}


	public FoodDTO foodOrder(String foodName) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("RestaurantMapper.foodOrder", foodName);
	}




}
