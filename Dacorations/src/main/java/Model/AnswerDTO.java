package Model;

import java.io.Serializable;
import java.util.Date;

public class AnswerDTO implements Serializable {
	private long BoardAnswerNum;  //댓글번호
	private long BoardNum; //글번호
	private String AnswerContent; //댓글내용
	private Date AnserDate; //댓글등록날짜
	private long AnserTime; //댓글등록시간
	
	public long getBoardAnswerNum() {
		return BoardAnswerNum;
	}
	public void setBoardAnswerNum(long boardAnswerNum) {
		BoardAnswerNum = boardAnswerNum;
	}
	public long getBoardNum() {
		return BoardNum;
	}
	public void setBoardNum(long boardNum) {
		BoardNum = boardNum;
	}
	public String getAnswerContent() {
		return AnswerContent;
	}
	public void setAnswerContent(String answerContent) {
		AnswerContent = answerContent;
	}
	public Date getAnserDate() {
		return AnserDate;
	}
	public void setAnserDate(Date anserDate) {
		AnserDate = anserDate;
	}
	public long getAnserTime() {
		return AnserTime;
	}
	public void setAnserTime(long anserTime) {
		AnserTime = anserTime;
	} 
	
}
