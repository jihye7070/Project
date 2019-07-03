package Commend;

public class MovieScreenCommand {
private Long MovieNum;
private int [] time;
private int theaterNum;
private int screenNum;

public Long getMovieNum() {
	return MovieNum;
}
public void setMovieNum(Long movieNum) {
	MovieNum = movieNum;
}
public int[] getTime() {
	return time;
}
public void setTime(int[] time) {
	this.time = time;
}
public int getTheaterNum() {
	return theaterNum;
}
public void setTheaterNum(int theaterNum) {
	this.theaterNum = theaterNum;
}
public int getScreenNum() {
	return screenNum;
}
public void setScreenNum(int screenNum) {
	this.screenNum = screenNum;
}

}
