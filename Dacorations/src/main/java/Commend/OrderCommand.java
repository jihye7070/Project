package Commend;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class OrderCommand {
	private int productNum;		//데이트상품 번호
	private int categoryNum;	//카테고리번호
	private String optionSeat;	//좌석번호
	private String optionTime;	//예약시간
	private String optionCheckin;	//체크인
	private String optionCheckout;	//체크아웃
    private String name;	//예약자명
	private String tell;	//예약자 연락처
	private String option; //옵션번호
	private int optionPrice; 

	private String optionDate;//예약날짜
	private String cardName;//카드사명
	private String [] cardNum;//카드번호
	private String cardTerm;
	
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public String[] getCardNum() {
		return cardNum;
	}
	public void setCardNum(String[] cardNum) {
		this.cardNum = cardNum;
	}
	public String getCardTerm() {
		return cardTerm;
	}
	public void setCardTerm(String cardTerm) {
		this.cardTerm = cardTerm;
	}
	public String getOptionDate() {
		return optionDate;
	}
	public void setOptionDate(String optionDate) {
		this.optionDate = optionDate;
	}
	public String getOption() {
		return option;
	}
	public void setOption(String option) {
		this.option = option;
	}
	public int getOptionPrice() {
		return optionPrice;
	}
	public void setOptionPrice(int optionPrice) {
		this.optionPrice = optionPrice;
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
	public String getOptionSeat() {
		return optionSeat;
	}
	public void setOptionSeat(String optionSeat) {
		this.optionSeat = optionSeat;
	}
	public String getOptionTime() {
		return optionTime;
	}
	public void setOptionTime(String optionTime) {
		this.optionTime = optionTime;
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
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTell() {
		return tell;
	}
	public void setTell(String tell) {
		this.tell = tell;
	}
	
	
	
}
