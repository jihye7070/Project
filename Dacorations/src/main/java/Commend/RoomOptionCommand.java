package Commend;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class RoomOptionCommand {

	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date checkin;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date checkout;
	public String accomodationName;
	public int roomPrice;
	public String roomImgstore;
	
	
	public String getRoomImgstore() {
		return roomImgstore;
	}
	public void setRoomImgstore(String roomImgstore) {
		this.roomImgstore = roomImgstore;
	}
	public Date getCheckin() {
		return checkin;
	}
	public void setCheckin(Date checkin) {
		this.checkin = checkin;
	}
	public Date getCheckout() {
		return checkout;
	}
	public void setCheckout(Date checkout) {
		this.checkout = checkout;
	}
	public String getAccomodationName() {
		return accomodationName;
	}
	public void setAccomodationName(String accomodationName) {
		this.accomodationName = accomodationName;
	}
	public int getRoomPrice() {
		return roomPrice;
	}
	public void setRoomPrice(int roomPrice) {
		this.roomPrice = roomPrice;
	}
	
	
	
	
}



