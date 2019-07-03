package Model;

import java.io.Serializable;

public class OptionDTO implements Serializable{
	private int optionNum;   //옵션번호
	private String optionProduct;  //옵션상품
	private int optionPrice; // 옵션 가격
	private String optionSoration; //옵션구분
	private int orderNum;
	public OptionDTO() {}
	
	
	
	public OptionDTO(String optionProduct, int optionPrice, String optionSoration) {
		super();
		this.optionProduct = optionProduct;
		this.optionPrice = optionPrice;
		this.optionSoration = optionSoration;
	}



	public int getOrderNum() {
		return orderNum;
	}



	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}



	public String getOptionSoration() {
		return optionSoration;
	}
	public void setOptionSoration(String optionSoration) {
		this.optionSoration = optionSoration;
	}
	public int getOptionNum() {
		return optionNum;
	}
	public void setOptionNum(int optionNum) {
		this.optionNum = optionNum;
	}
	public String getOptionProduct() {
		return optionProduct;
	}
	public void setOptionProduct(String optionProduct) {
		this.optionProduct = optionProduct;
	}
	public int getOptionPrice() {
		return optionPrice;
	}
	public void setOptionPrice(int optionPrice) {
		this.optionPrice = optionPrice;
	}
	
	
	
}
