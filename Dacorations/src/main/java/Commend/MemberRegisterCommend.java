package Commend;
//MemberRegister.jsp로 부터 받아오게되는 데이터를 저장하는 커맨드객체

public class MemberRegisterCommend {
private String id;
private String passward;
private String email;
private String gender;
private String [] tell;
private String address;
private String detailAddress;
private String mailConfrim;
private String name;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getPassward() {
	return passward;
}
public void setPassward(String passward) {
	this.passward = passward;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
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
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}


}
