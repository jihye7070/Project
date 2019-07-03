package Commend;

import org.springframework.web.multipart.MultipartFile;

public class FoodCommand {
	private Long num;
	private String foodName;
	private String foodType;
	private String foodPrice;
	private MultipartFile foodImage;
	private String foodInform;
	
	public Long getNum() {
		return num;
	}
	public void setNum(Long num) {
		this.num = num;
	}
	
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public String getFoodType() {
		return foodType;
	}
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	public String getFoodPrice() {
		return foodPrice;
	}
	public void setFoodPrice(String foodPrice) {
		this.foodPrice = foodPrice;
	}
	public MultipartFile getFoodImage() {
		return foodImage;
	}
	public void setFoodImage(MultipartFile foodImage) {
		this.foodImage = foodImage;
	}
	public String getFoodInform() {
		return foodInform;
	}
	public void setFoodInform(String foodInform) {
		this.foodInform = foodInform;
	}
	
	
	
}
