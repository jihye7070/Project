package Model;

import java.io.Serializable;

public class DateProductMovieDTO implements Serializable{

/*	PRODUCT_NUM	--데이트상품번호
	SCREEN_NUM	--상영관번호
	THEATER_NUM	--영화관번호
	CATEGORY_NUM--카테고리번호
	MOVIE_START--영화시작시간
	MOVIE_DATE--영화상영일
	MOVIE_NUM	--영화번호*/
	
	private Long productNum;
	private int screenNum;
	private int theaterNum;
	private int categoryNum;
	private String movieStart;
	private Long movieNum;
	
	
	
	public DateProductMovieDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DateProductMovieDTO(Long productNum, int screenNum, int theaterNum, int categoryNum, String movieStart,
			Long movieNum) {
		super();
		this.productNum = productNum;
		this.screenNum = screenNum;
		this.theaterNum = theaterNum;
		this.categoryNum = categoryNum;
		this.movieStart = movieStart;
		this.movieNum = movieNum;
	}
	public Long getProductNum() {
		return productNum;
	}
	public void setProductNum(Long productNum) {
		this.productNum = productNum;
	}
	public int getScreenNum() {
		return screenNum;
	}
	public void setScreenNum(int screenNum) {
		this.screenNum = screenNum;
	}
	public int getTheaterNum() {
		return theaterNum;
	}
	public void setTheaterNum(int theaterNum) {
		this.theaterNum = theaterNum;
	}
	public int getCategoryNum() {
		return categoryNum;
	}
	public void setCategoryNum(int categoryNum) {
		this.categoryNum = categoryNum;
	}
	public String getMovieStart() {
		return movieStart;
	}
	public void setMovieStart(String movieStart) {
		this.movieStart = movieStart;
	}
	public Long getMovieNum() {
		return movieNum;
	}
	public void setMovieNum(Long movieNum) {
		this.movieNum = movieNum;
	}
	
	
}
