package Model;

import java.io.Serializable;

public class FoodDTO implements Serializable{
	/*	RESTAURANT_NUM 
	FOOD_NUM -- 
	PRODUCT_NUM
	CATEGORY_NUM
	FOOD_PRICE
	FOOD_IMAGE
	FOOD_IMGSTORE
	FOOD_INFORM
	FOOD_NAME
	FOOD_TYPE*/
	
	private Long restaurantNum;
	private Long foodNum;
	private String PRODUCTNUM;
	private String CATEGORYNUM;
	private String foodPrice;
	private String foodImage;
	private String foodImgStore;
	private String foodInfo;
	private String foodName;
	private String foodType;
	
	public FoodDTO() {}
	
	
	
	
	public FoodDTO(Long restaurantNum,  String foodPrice, String foodImage,
			String foodImgStore, String foodInfo, String foodName, String foodType) {
		super();
		this.restaurantNum = restaurantNum;
		this.foodPrice = foodPrice;
		this.foodImage = foodImage;
		this.foodImgStore = foodImgStore;
		this.foodInfo = foodInfo;
		this.foodName = foodName;
		this.foodType = foodType;
	}




	public String getPRODUCTNUM() {
		return PRODUCTNUM;
	}




	public void setPRODUCTNUM(String pRODUCTNUM) {
		PRODUCTNUM = pRODUCTNUM;
	}




	public String getCATEGORYNUM() {
		return CATEGORYNUM;
	}




	public void setCATEGORYNUM(String cATEGORYNUM) {
		CATEGORYNUM = cATEGORYNUM;
	}




	public Long getRestaurantNum() {
		return restaurantNum;
	}
	public void setRestaurantNum(Long restaurantNum) {
		this.restaurantNum = restaurantNum;
	}
	public Long getFoodNum() {
		return foodNum;
	}
	public void setFoodNum(Long foodNum) {
		this.foodNum = foodNum;
	}

	public String getFoodPrice() {
		return foodPrice;
	}
	public void setFoodPrice(String foodPrice) {
		this.foodPrice = foodPrice;
	}
	public String getFoodImage() {
		return foodImage;
	}
	public void setFoodImage(String foodImage) {
		this.foodImage = foodImage;
	}
	public String getFoodImgStore() {
		return foodImgStore;
	}
	public void setFoodImgStore(String foodImgStore) {
		this.foodImgStore = foodImgStore;
	}
	public String getFoodInfo() {
		return foodInfo;
	}
	public void setFoodInfo(String foodInfo) {
		this.foodInfo = foodInfo;
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
	
	
	
}
