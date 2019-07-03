package Model;

import java.io.Serializable;
import java.util.Date;

public class MemberDTO implements Serializable{
// 데이터베이스
	
	/*	MEMBER_ID--회원아이디
	MEMBER_PW--회원비밀번호
	MEMBER_TELL--회원휴대폰번호
	MEMBER_GENDER--회원성별
	MEMBER_MAIL--회원이메일
	MEMBER_ADD--회원주소
	MEMBER_AREA--회원거주지역
	MEMBER_NAME--회원이름
	MAIL_CONFRIM--이메일수신여부*/


//DTO
private String memberId;
private String memberPw;
private String memberTell;
private String memberGender;
private String memberMail;
private String memberAdd;
private String memberArea;
private String mailConfrim;
private String memberName;
private Date   memberDate;   
private String memberLastDate;
private Date   passChangeDate;


public  MemberDTO() {};
public MemberDTO(String memberId, String memberPw, String memberTell, String memberGender, String memberMail,
		String memberAdd, String memberArea, String mailConfrim, String memberName) {
	super();
	this.memberId = memberId;
	this.memberPw = memberPw;
	this.memberTell = memberTell;
	this.memberGender = memberGender;
	this.memberMail = memberMail;
	this.memberAdd = memberAdd;
	this.memberArea = memberArea;
	this.mailConfrim = mailConfrim;
	this.memberName = memberName;
}

 
public Date getPassChangeDate() {
	return passChangeDate;
}
public void setPassChangeDate(Date passChangeDate) {
	this.passChangeDate = passChangeDate;
}
public String getMemberLastDate() {
	return memberLastDate;
}
public void setMemberLastDate(String memberLastDate) {
	this.memberLastDate = memberLastDate;
}
public Date getMemberDate() {
	return memberDate;
}
public void setMemberDate(Date memberDate) {
	this.memberDate = memberDate;
}
public String getMemberId() {
	return memberId;
}
public void setMemberId(String memberId) {
	this.memberId = memberId;
}
public String getMemberPw() {
	return memberPw;
}
public void setMemberPw(String memberPw) {
	this.memberPw = memberPw;
}
public String getMemberTell() {
	return memberTell;
}
public void setMemberTell(String memberTell) {
	this.memberTell = memberTell;
}
public String getMemberGender() {
	return memberGender;
}
public void setMemberGender(String memberGender) {
	this.memberGender = memberGender;
}
public String getMemberMail() {
	return memberMail;
}
public void setMemberMail(String memberMail) {
	this.memberMail = memberMail;
}
public String getMemberAdd() {
	return memberAdd;
}
public void setMemberAdd(String memberAdd) {
	this.memberAdd = memberAdd;
}
public String getMemberArea() {
	return memberArea;
}
public void setMemberArea(String memberArea) {
	this.memberArea = memberArea;
}
public String getMailConfrim() {
	return mailConfrim;
}
public void setMailConfrim(String mailConfrim) {
	this.mailConfrim = mailConfrim;
}
public String getMemberName() {
	return memberName;
}
public void setMemberName(String memberName) {
	this.memberName = memberName;
}
}