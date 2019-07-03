package Model;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class OrderDTO  implements Serializable{
/*	
  	ORDER_NUM --..자동생성,,,.,.,.,.
	PRODUCT_NUM
	CATEGORY_NUM
	RESERVE_TIME
	CHEKIN
	CHEKOUT
	RESERVE_DATE
	SEATE_NUM
	*/
	private int orderNum;
	private int productNum;
	private int categoryNum;
	private String reserveTime;
	private String checkIn;
	private String checkOut;
	private String reserveDate;
	private String seateNum;
	private String reserveName;
	private String reserveTell;
	private Date orderDate;
	private String memberId;
	
	
	
	public OrderDTO() {}

	public OrderDTO(int productNum, int categoryNum, String reserveTime, String checkIn, String checkOut,
			 String seateNum, String reserveName, String reserveTell, String memberId,String reserveDate) {
		super();
		this.productNum = productNum;
		this.categoryNum = categoryNum;
		this.reserveTime = reserveTime;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.seateNum = seateNum;
		this.reserveName = reserveName;
		this.reserveTell = reserveTell;
		this.memberId = memberId;
		this.reserveDate=reserveDate;
	}



	public int getOrderNum() {
		return orderNum;
	}



	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}



	public int getProductNum() {
		return productNum;
	}



	public void setProductNum(int productNum) {
		this.productNum = productNum;
	}



	public int getCategoryNum() {
		return categoryNum;
	}



	public void setCategoryNum(int categoryNum) {
		this.categoryNum = categoryNum;
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



	public String getReserveDate() {
		return reserveDate;
	}



	public void setReserveDate(String reserveDate) {
		this.reserveDate = reserveDate;
	}



	public String getSeateNum() {
		return seateNum;
	}



	public void setSeateNum(String seateNum) {
		this.seateNum = seateNum;
	}



	public String getReserveName() {
		return reserveName;
	}



	public void setReserveName(String reserveName) {
		this.reserveName = reserveName;
	}



	public String getReserveTell() {
		return reserveTell;
	}



	public void setReserveTell(String reserveTell) {
		this.reserveTell = reserveTell;
	}



	public Date getOrderDate() {
		return orderDate;
	}



	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}



	public String getMEMBER_ID() {
		return memberId;
	}



	public void setMEMBER_ID(String mEMBER_ID) {
		memberId = mEMBER_ID;
	}
	
	
}
