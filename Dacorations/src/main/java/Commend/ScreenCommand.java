package Commend;

import org.springframework.web.multipart.MultipartFile;

public class ScreenCommand {
private Long theaterNum;
private String screenName;
private int screenRow;
private int screenColum;
private String screenKind;
private int screenPlus;
private MultipartFile screenFile;

public int getScreenPlus() {
	return screenPlus;
}
public void setScreenPlus(int screenPlus) {
	this.screenPlus = screenPlus;
}
public MultipartFile getScreenFile() {
	return screenFile;
}
public void setScreenFile(MultipartFile screenFile) {
	this.screenFile = screenFile;
}
public Long getTheaterNum() {
	return theaterNum;
}
public void setTheaterNum(Long theaterNum) {
	this.theaterNum = theaterNum;
}
public String getScreenName() {
	return screenName;
}
public void setScreenName(String screenName) {
	this.screenName = screenName;
}
public int getScreenRow() {
	return screenRow;
}
public void setScreenRow(int screenRow) {
	this.screenRow = screenRow;
}
public int getScreenColum() {
	return screenColum;
}
public void setScreenColum(int screenColum) {
	this.screenColum = screenColum;
}
public String getScreenKind() {
	return screenKind;
}
public void setScreenKind(String screenKind) {
	this.screenKind = screenKind;
}
}
