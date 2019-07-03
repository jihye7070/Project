package Commend;

import org.springframework.web.multipart.MultipartFile;

public class RestaurantRegisterCommand {
	private String restaurantName;
	private String restaurantKind;
	private String address;
	private String detailAddress;
	private MultipartFile restaurantImage;
	private String[] restaurantTell;
	private String restaurantInfo; 
	private int tableCount;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDetailAddress() {
		return detailAddress;
	}
	public void setDetailAddress(String detailAddress) {
		this.detailAddress = detailAddress;
	}
	public MultipartFile getRestaurantImage() {
		return restaurantImage;
	}
	public void setRestaurantImage(MultipartFile restaurantImage) {
		this.restaurantImage = restaurantImage;
	}
	public String[] getRestaurantTell() {
		return restaurantTell;
	}
	public void setRestaurantTell(String[] restaurantTell) {
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
