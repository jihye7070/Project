package Commend;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class RestaurantOptionCommand {
	private String foodName;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date foodDate;
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public Date getFoodDate() {
		return foodDate;
	}
	public void setFoodDate(Date foodDate) {
		this.foodDate = foodDate;
	}
	
	
	
}
