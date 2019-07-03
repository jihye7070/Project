package Model;

import java.io.Serializable;

public class OrderDetailDTO implements Serializable{
	private String reserveTime;
	private String checkIn;
	private String checkOut;
	private String reserveDate;
	private String seatNum;
	private String imgStore;
	private String productName;
	
	
	
	public OrderDetailDTO() {}
	public OrderDetailDTO( String reserveTime, String checkIn, String checkOut, String reserveDate, String seatNum,
			String imgStore, String productName) {
		super();
		this.reserveTime = reserveTime;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.reserveDate = reserveDate;
		this.seatNum = seatNum;
		this.imgStore = imgStore;
		this.productName = productName;
	}
	public String getReserveDate() {
		return reserveDate;
	}
	public void setReserveDate(String reserveDate) {
		this.reserveDate = reserveDate;
	}
	public String getReserveTime() {
		return reserveTime;
	}
	public void setReserveTime(String reserveTime) {
		this.reserveTime = reserveTime;
	}
	public String getCheckIn() {
		return checkIn;
	}
	public void setCheckIn(String checkIn) {
		this.checkIn = checkIn;
	}
	public String getCheckOut() {
		return checkOut;
	}
	public void setCheckOut(String checkOut) {
		this.checkOut = checkOut;
	}
	public String getSeatNum() {
		return seatNum;
	}
	public void setSeatNum(String seatNum) {
		this.seatNum = seatNum;
	}
	public String getImgStore() {
		return imgStore;
	}
	public void setImgStore(String imgStore) {
		this.imgStore = imgStore;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	
	
	
}
