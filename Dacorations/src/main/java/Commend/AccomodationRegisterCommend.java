package Commend;

import org.springframework.web.multipart.MultipartFile;

public class AccomodationRegisterCommend {
	private String bFacilityName;
	private String address;
	private String addressDetail;
	private String[] tell;
	private String bFacilityImform;
	private MultipartFile boardFile;
	private String AccomodationKind;
	
	public String getbFacilityName() {
		return bFacilityName;
	}
	public String getAccomodationKind() {
		return AccomodationKind;
	}
	public void setAccomodationKind(String accomodationKind) {
		AccomodationKind = accomodationKind;
	}
	public void setbFacilityName(String bFacilityName) {
		this.bFacilityName = bFacilityName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddressDetail() {
		return addressDetail;
	}
	public void setAddressDetail(String addressDetail) {
		this.addressDetail = addressDetail;
	}
	public String[] getTell() {
		return tell;
	}
	public void setTell(String[] tell) {
		this.tell = tell;
	}
	public String getbFacilityImform() {
		return bFacilityImform;
	}
	public void setbFacilityImform(String bFacilityImform) {
		this.bFacilityImform = bFacilityImform;
	}
	public MultipartFile getBoardFile() {
		return boardFile;
	}
	public void setBoardFile(MultipartFile boardFile) {
		this.boardFile = boardFile;
	}
	
}
