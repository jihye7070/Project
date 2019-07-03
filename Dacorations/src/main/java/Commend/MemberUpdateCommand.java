package Commend;

public class MemberUpdateCommand {
	private String id;
	private String name;
	private String password;
	private String email;
	private String [] tell;
	private String address;
	private String detailAddress;
	private String mailConfrim;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	} 
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String[] getTell() {
		return tell;
	}
	public void setTell(String[] tell) {
		this.tell = tell;
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
	public String getMailConfrim() {
		return mailConfrim;
	}
	public void setMailConfrim(String mailConfrim) {
		this.mailConfrim = mailConfrim;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
