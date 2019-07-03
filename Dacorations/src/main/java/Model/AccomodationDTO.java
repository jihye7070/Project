package Model;

import java.io.Serializable;

public class AccomodationDTO implements Serializable{
// 데이터베이스
    /*ACCOMODATION_NUM --숙박번호
     ACCOMODATION_NAME --숙박시설이름
     ACCOMODATION_ADD --숙박주소
     ACCOMODATION_AREA --숙소지역
     ACCOMODATION_KIND --숙소이미지
     ACCOMODATION_TELL --숙소전화번호
     ACCOMODATION_IMG --숙소 오리지날 이미지
     ACCOMODATION_IMGSTORE --숙소 스토어 이미지
     ACCOMODATION_INFORM --숙소정보
     ACCOMODATION_AVG--객실평균가격
 */

	//AccomodationDTO
private int accomodationNum;
private String accomodationName;
private String accomodationAdd;
private String accmodationArea;
private String accmodationKind;
private String accmodationTell;
private String accmodationImg;
private String accmodationImgstore;
private String accomodationInform;
private int accomodationAvg;
private Integer count;


public AccomodationDTO() {}
public AccomodationDTO( String accomodationName, String accomodationAdd, String accmodationArea,
		String accmodationKind, String accmodationTell, String accmodationImg, String accmodationImgstore ,String accomodationInform) {
	super();
	this.accomodationName = accomodationName;
	this.accomodationAdd = accomodationAdd;
	this.accmodationArea = accmodationArea;
	this.accmodationKind = accmodationKind;
	this.accmodationTell = accmodationTell;
	this.accmodationImg = accmodationImg;
	this.accmodationImgstore = accmodationImgstore;
    this.accomodationInform=accomodationInform;}

public int getAccomodationAvg() {
	return accomodationAvg;
}
public void setAccomodationAvg(int accomodationAvg) {
	this.accomodationAvg = accomodationAvg;
}

public Integer getCount() {
	return count;
}
public void setCount(Integer count) {
	this.count = count;
}
public String getAccomodationInform() {
	return accomodationInform;
}
public void setAccomodationInform(String accomodationInform) {
	this.accomodationInform = accomodationInform;
}
public int getAccomodationNum() {
	return accomodationNum;
}
public void setAccomodationNum(int accomodationNum) {
	this.accomodationNum = accomodationNum;
}
public String getAccomodationName() {
	return accomodationName;
}
public void setAccomodationName(String accomodationName) {
	this.accomodationName = accomodationName;
}
public String getAccomodationAdd() {
	return accomodationAdd;
}
public void setAccomodationAdd(String accomodationAdd) {
	this.accomodationAdd = accomodationAdd;
}
public String getAccmodationArea() {
	return accmodationArea;
}
public void setAccmodationArea(String accmodationArea) {
	this.accmodationArea = accmodationArea;
}
public String getAccmodationKind() {
	return accmodationKind;
}
public void setAccmodationKind(String accmodationKind) {
	this.accmodationKind = accmodationKind;
}
public String getAccmodationTell() {
	return accmodationTell;
}
public void setAccmodationTell(String accmodationTell) {
	this.accmodationTell = accmodationTell;
}
public String getAccmodationImg() {
	return accmodationImg;
}
public void setAccmodationImg(String accmodationImg) {
	this.accmodationImg = accmodationImg;
}
public String getAccmodationImgstore() {
	return accmodationImgstore;
}
public void setAccmodationImgstore(String accmodationImgstore) {
	this.accmodationImgstore = accmodationImgstore;
}
}
