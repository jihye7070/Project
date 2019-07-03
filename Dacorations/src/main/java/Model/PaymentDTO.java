package Model;

import java.io.Serializable;
import java.util.Date;

public class PaymentDTO implements Serializable{

	/*PAY_NUM	--결제번호
	ORDER_NUM--주문번호
	CARD_NUM--카드번호
	PAY_PRICE--결제금액
	CARD_TERM--할부기간
	CARD_NAME--카드사이름
	PAY_DATE--결제날짜*/
	
	private Long payNum;
	private int orderNum;
	private String cardNum;
	private int payPrice;
	private String cardTerm;
	private String cardName;
	private Date payDate;
	
	
	public PaymentDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PaymentDTO(int orderNum, String cardNum, int payPrice, String cardTerm, String cardName) {
		super();
		this.orderNum = orderNum;
		this.cardNum = cardNum;
		this.payPrice = payPrice;
		this.cardTerm = cardTerm;
		this.cardName = cardName;
		
	}
	public Long getPayNum() {
		return payNum;
	}
	public void setPayNum(Long payNum) {
		this.payNum = payNum;
	}
	public int getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}
	public String getCardNum() {
		return cardNum;
	}
	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}
	public int getPayPrice() {
		return payPrice;
	}
	public void setPayPrice(int payPrice) {
		this.payPrice = payPrice;
	}
	public String getCardTerm() {
		return cardTerm;
	}
	public void setCardTerm(String cardTerm) {
		this.cardTerm = cardTerm;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public Date getPayDate() {
		return payDate;
	}
	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}
	
	
}
