package Model;

import java.io.Serializable;

public class TheaterRegisterDTO implements Serializable{
// 데이터베이스			
	/*
	THEATER_NUM	--영화관번호
	THEATER_NAME--영화관이름
	THEATER_ADD	--영화관주소
	THEATER_AREA --영화관지역
	THEATER_TELL --영화관전화번호
	THEATER_KIND --영화관종류
	*/
	private Long theaterNum;
	private String theaterName;
	private String theaterAdd;
	private String theaterArea;
	private String theaterTell;
	private String theaterKind;
	
	
	
	public TheaterRegisterDTO() {
	}
	public TheaterRegisterDTO(String theaterName, String theaterAdd, String theaterArea, String theaterTell,
			String theaterKind) {
		
		this.theaterName = theaterName;
		this.theaterAdd = theaterAdd;
		this.theaterArea = theaterArea;
		this.theaterTell = theaterTell;
		this.theaterKind = theaterKind;
	}
	public Long getTheaterNum() {
		return theaterNum;
	}
	public void setTheaterNum(Long theaterNum) {
		this.theaterNum = theaterNum;
	}
	public String getTheaterName() {
		return theaterName;
	}
	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}
	public String getTheaterAdd() {
		return theaterAdd;
	}
	public void setTheaterAdd(String theaterAdd) {
		this.theaterAdd = theaterAdd;
	}
	public String getTheaterArea() {
		return theaterArea;
	}
	public void setTheaterArea(String theaterArea) {
		this.theaterArea = theaterArea;
	}
	public String getTheaterTell() {
		return theaterTell;
	}
	public void setTheaterTell(String theaterTell) {
		this.theaterTell = theaterTell;
	}
	public String getTheaterKind() {
		return theaterKind;
	}
	public void setTheaterKind(String theaterKind) {
		this.theaterKind = theaterKind;
	}
}
