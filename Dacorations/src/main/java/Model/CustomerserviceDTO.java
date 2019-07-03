package Model;

import java.io.Serializable;
import java.util.Date;

public class CustomerserviceDTO implements Serializable{
	private Long BoardNum;	//글번호
	private String MemberId; //회원아이디
	private Long ChargeNum; // 담당자번호
	private String BoardContent; // 게시판내용
	private Date BoardDate; // 게시판등록일
	private String BoardAnswer; // 게시판 댓글
	private String BoardKind; // 글구분
	private String BoardTitle; // 게시판제목
	
	
	public Long getBoardNum() {
		return BoardNum;
	}
	public void setBoardNum(Long boardNum) {
		BoardNum = boardNum;
	}
	public String getMemberId() {
		return MemberId;
	}
	public void setMemberId(String memberId) {
		MemberId = memberId;
	}
	public Long getChargeNum() {
		return ChargeNum;
	}
	public void setChargeNum(Long chargeNum) {
		ChargeNum = chargeNum;
	}
	public String getBoardContent() {
		return BoardContent;
	}
	public void setBoardContent(String boardContent) {
		BoardContent = boardContent;
	}
	public Date getBoardDate() {
		return BoardDate;
	}
	public void setBoardDate(Date boardDate) {
		BoardDate = boardDate;
	}
	public String getBoardAnswer() {
		return BoardAnswer;
	}
	public void setBoardAnswer(String boardAnswer) {
		BoardAnswer = boardAnswer;
	}
	public String getBoardKind() {
		return BoardKind;
	}
	public void setBoardKind(String boardKind) {
		BoardKind = boardKind;
	}
	public String getBoardTitle() {
		return BoardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		BoardTitle = boardTitle;
	}
	
	
	
	
}
