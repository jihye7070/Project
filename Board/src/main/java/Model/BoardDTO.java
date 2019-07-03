package Model;

import java.io.Serializable;
import java.util.Date;

public class BoardDTO implements Serializable  {
	
	private String boardSubject;
	private String boardName;
	private String boardPass;
	private String boardContent;
	private Date boardDate;
	private Long boardNum;
	private Long rowNum;
	
	public BoardDTO() {}

	public BoardDTO( String boardSubject, String boardName, String boardPass, String boardContent) {
		super();
		this.boardSubject = boardSubject;
		this.boardName = boardName;
		this.boardPass = boardPass;
		this.boardContent = boardContent;
	}


	public String getBoardSubject() {
		return boardSubject;
	}

	public void setBoardSubject(String boardSubject) {
		this.boardSubject = boardSubject;
	}

	public String getBoardName() {
		return boardName;
	}

	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}

	public String getBoardPass() {
		return boardPass;
	}

	public void setBoardPass(String boardPass) {
		this.boardPass = boardPass;
	}

	public String getBoardContent() {
		return boardContent;
	}

	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}

	public Date getBoardDate() {
		return boardDate;
	}

	public void setBoardDate(Date boardDate) {
		this.boardDate = boardDate;
	}

	public Long getBoardNum() {
		return boardNum;
	}

	public void setBoardNum(Long boardNum) {
		this.boardNum = boardNum;
	}

	public Long getRowNum() {
		return rowNum;
	}

	public void setRowNum(Long rowNum) {
		this.rowNum = rowNum;
	}
	
	
	
}
