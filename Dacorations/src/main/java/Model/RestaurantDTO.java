package Model;

import java.io.Serializable;

public class RestaurantDTO implements Serializable {
/*	RESTAURANT_NUM
	RESTAURANT_NAME
	RESTAURANT_KIND
	RESTAURANT_ADD
	RESTAURANT_AREA
	RESTAURANT_IMAGE
	RESTAURANT_TELL
	RESTAURANT_INFO
	TABLE_COUNT*/
	
	private int restaurantNum;
	private String restaurantName;
	private String restaurantKind;
	private String restaurantAdd;
	private String restaurantArea;
	private String restaurantImage;
	private String restaurantImgStore;
	private String restaurantTell;
	private String restaurantInfo;
	private int tableCount;
	
	
	
	
	
	public RestaurantDTO() {}
	public RestaurantDTO(String restaurantName, String restaurantKind, String restaurantAdd,
			String restaurantArea, String restaurantImage,String restaurantImgStore, String restaurantTell, String restaurantInfo,
			int tableCount) {
		super();
		this.restaurantName = restaurantName;
		this.restaurantKind = restaurantKind;
		this.restaurantAdd = restaurantAdd;
		this.restaurantArea = restaurantArea;
		this.restaurantImage = restaurantImage;
		this.restaurantImgStore = restaurantImgStore;
		this.restaurantTell = restaurantTell;
		this.restaurantInfo = restaurantInfo;
		this.tableCount = tableCount;
	}
	
	
	
	public String getRestaurantImgStore() {
		return restaurantImgStore;
	}
	public void setRestaurantImgStore(String restaurantImgStore) {
		this.restaurantImgStore = restaurantImgStore;
	}
	public int getRestaurantNum() {
		return restaurantNum;
	}
	public void setRestaurantNum(int restaurantNum) {
		this.restaurantNum = restaurantNum;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public String getRestaurantKind() {
		return restaurantKind;
	}
	public void setRestaurantKind(String restaurantKind) {
		this.restaurantKind = restaurantKind;
	}
	public String getRestaurantAdd() {
		return restaurantAdd;
	}
	public void setRestaurantAdd(String restaurantAdd) {
		this.restaurantAdd = restaurantAdd;
	}
	public String getRestaurantArea() {
		return restaurantArea;
	}
	public void setRestaurantArea(String restaurantArea) {
		this.restaurantArea = restaurantArea;
	}
	public String getRestaurantImage() {
		return restaurantImage;
	}
	public void setRestaurantImage(String restaurantImage) {
		this.restaurantImage = restaurantImage;
	}
	public String getRestaurantTell() {
		return restaurantTell;
	}
	public void setRestaurantTell(String restaurantTell) {
		this.restaurantTell = restaurantTell;
	}
	public String getRestaurantInfo() {
		return restaurantInfo;
	}
	public void setRestaurantInfo(String restaurantInfo) {
		this.restaurantInfo = restaurantInfo;
	}
	public int getTableCount() {
		return tableCount;
	}
	public void setTableCount(int tableCount) {
		this.tableCount = tableCount;
	}
	
	
}
