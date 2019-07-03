package Model;

import java.io.Serializable;

public class DateMovieDTO implements Serializable{

	/*PRODUCT_NUM
	MOVIE_STOREIMG
	SCREEN_KIND,
	SCREEN_ROW, 
	SCREEN_COLUMN, 
	SCREEN_NAME
	MOVIE_PRICE
	SCREEN_PLUS 
	MOVIE_START*/
	
	private Long productNum;
	private String movieStoreimg;
	private String screenKind;
	private int screenRow;
	private int screenColumn;
	private String screenName;
	private Long screenNum;
	private int moviePrice;
	private int screenPlus;
	private String movieStart;
	private String movieTitel;
	private Long movieNum;

	public Long getScreenNum() {
		return screenNum;
	}
	public void setScreenNum(Long screenNum) {
		this.screenNum = screenNum;
	}
	public Long getMovieNum() {
		return movieNum;
	}
	public void setMovieNum(Long movieNum) {
		this.movieNum = movieNum;
	}
	public String getMovieStart() {
		return movieStart;
	}
	public void setMovieStart(String movieStart) {
		this.movieStart = movieStart;
	}
	public String getMovieTitel() {
		return movieTitel;
	}
	public void setMovieTitel(String movieTitel) {
		this.movieTitel = movieTitel;
	}
	public Long getProductNum() {
		return productNum;
	}
	public void setProductNum(Long productNum) {
		this.productNum = productNum;
	}
	public String getMovieStoreimg() {
		return movieStoreimg;
	}
	public void setMovieStoreimg(String movieStoreimg) {
		this.movieStoreimg = movieStoreimg;
	}
	public String getScreenKind() {
		return screenKind;
	}
	public void setScreenKind(String screenKind) {
		this.screenKind = screenKind;
	}
	public int getScreenRow() {
		return screenRow;
	}
	public void setScreenRow(int screenRow) {
		this.screenRow = screenRow;
	}
	public int getScreenColumn() {
		return screenColumn;
	}
	public void setScreenColumn(int screenColumn) {
		this.screenColumn = screenColumn;
	}
	public String getScreenName() {
		return screenName;
	}
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	public int getMoviePrice() {
		return moviePrice;
	}
	public void setMoviePrice(int moviePrice) {
		this.moviePrice = moviePrice;
	}
	public int getScreenPlus() {
		return screenPlus;
	}
	public void setScreenPlus(int screenPlus) {
		this.screenPlus = screenPlus;
	}
	
}
