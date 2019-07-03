package Commend;

import java.util.Date;

public class CustomerServiceCommand {
	private Long BoardNum; //글번호
	private Long ChargeNum;
	private String AnswerContent; //댓글내용
	
	public Long getBoardNum() {
		return BoardNum;
	}
	public void setBoardNum(Long boardNum) {
		BoardNum = boardNum;
	}
	public Long getChargeNum() {
		return ChargeNum;
	}
	public void setChargeNum(Long chargeNum) {
		ChargeNum = chargeNum;
	}
	public String getAnswerContent() {
		return AnswerContent;
	}
	public void setAnswerContent(String answerContent) {
		AnswerContent = answerContent;
	}
	

	
	
}
