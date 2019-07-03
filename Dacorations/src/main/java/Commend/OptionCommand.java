package Commend;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class OptionCommand {
	private int count;
	private String productType;   //데이트상품 타입
	private String productName;  // 데이트 상품이름
	private String productNum; //데이트번호
	private String optionTime; // 데이트시간 
	private String optionPrice; //입장요금
	private String optionimg; // 이미지
	private String optionSeat; //좌석 null
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private String optionCheckin; //체크인 null
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private String optionCheckout;
	private int foodName;
	private int categoryNum;
	
	public int getCategoryNum() {
		return categoryNum;
	}
	public void setCategoryNum(int categoryNum) {
		this.categoryNum = categoryNum;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getFoodName() {
		return foodName;
	}
	public void setFoodName(int foodName) {
		this.foodName = foodName;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getOptionTime() {
		return optionTime;
	}
	public void setOptionTime(String optionTime) {
		this.optionTime = optionTime;
	}
	
	public String  getProductNum() {
		return productNum;
	}
	public void setProductNum(String  productNum) {
		this.productNum = productNum;
	}
	public String getOptionPrice() {
		return optionPrice;
	}
	public void setOptionPrice(String optionPrice) {
		this.optionPrice = optionPrice;
	}
	public String getOptionimg() {
		return optionimg;
	}
	public void setOptionimg(String optionimg) {
		this.optionimg = optionimg;
	}
	public String getOptionSeat() {
		return optionSeat;
	}
	public void setOptionSeat(String optionSeat) {
		this.optionSeat = optionSeat;
	}
	public String getOptionCheckin() {
		return optionCheckin;
	}
	public void setOptionCheckin(String optionCheckin) {
		this.optionCheckin = optionCheckin;
	}
	public String getOptionCheckout() {
		return optionCheckout;
	}
	public void setOptionCheckout(String optionCheckout) {
		this.optionCheckout = optionCheckout;
	} //체크아웃 null
	
}
	