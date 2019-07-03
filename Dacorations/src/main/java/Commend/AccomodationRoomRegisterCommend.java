package Commend;

import org.springframework.web.multipart.MultipartFile;

public class AccomodationRoomRegisterCommend {
	private Long num;
	private String aProKind;
	private Long aProPrice;
	private Long count;
	private String proAdTime1; 
	private String proAdTime2; 
	private String proAdTime3; 
	private String proExTime1;
	private String proExTime2;
	private String proExTime3;
	private MultipartFile[] boardFile;
	
	public Long getNum() {
		return num;
	}
	public void setNum(Long num) {
		this.num = num;
	}
	public String getaProKind() {
		return aProKind;
	}
	public void setaProKind(String aProKind) {
		this.aProKind = aProKind;
	}
	public Long getaProPrice() {
		return aProPrice;
	}
	public void setaProPrice(Long aProPrice) {
		this.aProPrice = aProPrice;
	}
	public Long getCount() {
		return count;
	}
	public void setCount(Long count) {
		this.count = count;
	}
	public String getProAdTime1() {
		return proAdTime1;
	}
	public void setProAdTime1(String proAdTime1) {
		this.proAdTime1 = proAdTime1;
	}
	public String getProAdTime2() {
		return proAdTime2;
	}
	public void setProAdTime2(String proAdTime2) {
		this.proAdTime2 = proAdTime2;
	}
	public String getProAdTime3() {
		return proAdTime3;
	}
	public void setProAdTime3(String proAdTime3) {
		this.proAdTime3 = proAdTime3;
	}
	public String getProExTime1() {
		return proExTime1;
	}
	public void setProExTime1(String proExTime1) {
		this.proExTime1 = proExTime1;
	}
	public String getProExTime2() {
		return proExTime2;
	}
	public void setProExTime2(String proExTime2) {
		this.proExTime2 = proExTime2;
	}
	public String getProExTime3() {
		return proExTime3;
	}
	public void setProExTime3(String proExTime3) {
		this.proExTime3 = proExTime3;
	}
	public MultipartFile[] getBoardFile() {
		return boardFile;
	}
	public void setBoardFile(MultipartFile[] boardFile) {
		this.boardFile = boardFile;
	}
}
