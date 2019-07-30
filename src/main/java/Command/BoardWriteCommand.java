package Command;

public class BoardWriteCommand {
	
	private String boardTitle;
	private String boardName;
	private String boardPass;
	private String boardContent;
	private Long reNum;
	private Long reLev;
	private Long reSeq;
	private Long parentNum;
	private Long boardNum;
	
	
	
	
	public Long getBoardNum() {
		return boardNum;
	}
	public void setBoardNum(Long boardNum) {
		this.boardNum = boardNum;
	}
	public Long getReNum() {
		return reNum;
	}
	public void setReNum(Long reNum) {
		this.reNum = reNum;
	}
	public Long getReLev() {
		return reLev;
	}
	public void setReLev(Long reLev) {
		this.reLev = reLev;
	}
	public Long getReSeq() {
		return reSeq;
	}
	public void setReSeq(Long reSeq) {
		this.reSeq = reSeq;
	}
	public Long getParentNum() {
		return parentNum;
	}
	public void setParentNum(Long parentNum) {
		this.parentNum = parentNum;
	}
	public String getBoardTitle() {
		return boardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
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
	
	
}
