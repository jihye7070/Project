package Model;

import java.io.Serializable;

public class ProductDTO implements Serializable {
	
	private String name;
	private String info;
	private String address;
	private String number;
	
	public ProductDTO() {}

	
	public ProductDTO(String name, String info, String address, String number) {
		super();
		this.name = name;
		this.info = info;
		this.address = address;
		this.number = number;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	
}
