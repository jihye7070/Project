package Model;

import java.io.Serializable;

public class MovieRegisterDTO implements Serializable{
	/*			
		MOVIE_NUM	--영화번호
		MOVIE_TITEL	--영화제목
		MOVIE_KIND	--영화종류
		MOVIE_AGE	--영화연령
		MOVIE_TIME	--영화상영시간
		MOVIE_PRICE	--영화가격
		MOVIE_IMAGE	--영화이미지
		MOVIE_INFORM--영화정보
		MOVIE_STOREIMG--영화 스토어 이미지
			*/
//	MOVIE_NUM      NOT NULL NUMBER         
//	MOVIE_TITEL    NOT NULL NVARCHAR2(200) 
//	MOVIE_KIND     NOT NULL VARCHAR2(1000) 
//	MOVIE_AGE      NOT NULL NUMBER         
//	MOVIE_TIME     NOT NULL NUMBER         
//	MOVIE_PRICE    NOT NULL NUMBER         
//	MOVIE_IMAGE    NOT NULL VARCHAR2(1000) 
//	MOVIE_INFORM   NOT NULL NVARCHAR2(300) 
//	MOVIE_STOREIMG          VARCHAR2(1000) 
private Long movieNum;
private String movieTitel;
private String movieKind;
private String movieAge;
private int movieTime;
private int moviePrice;
private String movieImage;
private String movieInform;
private String movieStoreimg;


public MovieRegisterDTO() {}
public MovieRegisterDTO(String movieTitel, String movieKind, String movieAge, int movieTime, int moviePrice,
		String movieImage, String movieInform, String movieStoreimg) {
	super();
	this.movieTitel = movieTitel;
	this.movieKind = movieKind;
	this.movieAge = movieAge;
	this.movieTime = movieTime;
	this.moviePrice = moviePrice;
	this.movieImage = movieImage;
	this.movieInform = movieInform;
	this.movieStoreimg = movieStoreimg;
}

public Long getMovieNum() {
	return movieNum;
}

public void setMovieNum(Long movieNum) {
	this.movieNum = movieNum;
}

public String getMovieTitel() {
	return movieTitel;
}

public void setMovieTitel(String movieTitel) {
	this.movieTitel = movieTitel;
}

public String getMovieKind() {
	return movieKind;
}

public void setMovieKind(String movieKind) {
	this.movieKind = movieKind;
}

public String getMovieAge() {
	return movieAge;
}
public void setMovieAge(String movieAge) {
	this.movieAge = movieAge;
}

public int getMovieTime() {
	return movieTime;
}

public void setMovieTime(int movieTime) {
	this.movieTime = movieTime;
}

public int getMoviePrice() {
	return moviePrice;
}

public void setMoviePrice(int moviePrice) {
	this.moviePrice = moviePrice;
}

public String getMovieImage() {
	return movieImage;
}

public void setMovieImage(String movieImage) {
	this.movieImage = movieImage;
}

public String getMovieInform() {
	return movieInform;
}

public void setMovieInform(String movieInform) {
	this.movieInform = movieInform;
}

public String getMovieStoreimg() {
	return movieStoreimg;
}

public void setMovieStoreimg(String movieStoreimg) {
	this.movieStoreimg = movieStoreimg;
}


}
