package Commend;

import org.springframework.web.multipart.MultipartFile;

public class MovieRegisterCommand {
private String movieTitle;
private String movieKind;
private String movieAge;
private int movieTime;
private int moviePrice;
private String movieInform;
private MultipartFile[] boardFile;
public String getMovieTitle() {
	return movieTitle;
}
public void setMovieTitle(String movieTitle) {
	this.movieTitle = movieTitle;
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
public String getMovieInform() {
	return movieInform;
}
public void setMovieInform(String movieInform) {
	this.movieInform = movieInform;
}
public MultipartFile[] getBoardFile() {
	return boardFile;
}
public void setBoardFile(MultipartFile[] boardFile) {
	this.boardFile = boardFile;
}
}
