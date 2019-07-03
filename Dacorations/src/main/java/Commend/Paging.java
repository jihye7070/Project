package Commend;

public class Paging {
	private int totalCount;		//전체 게시물 수
	private int pageNum;		//현재 페이지번호
	private int contentNum=10;		//한 페이지당 표시 개수
	private int startPage=1;		//현재 페이지블록의 시작페이지
	private int endPage=5;		//현재 페이지불록의 마지막
/*	private boolean prev;		//이전페이지
	private boolean next;		//다음 페이지
*/	private int currentBlock; 	//현재페이지블록
	private int lastBlock;		//마지막페이지 블록
	
	public int calcpage(int totalCount, int contentNum) {	//전체 페이지 수를 계산하는
		
		//전체 게시글이 135개 / 한 페이지당 나타낼 게시글 10개 => 13.5
		//14페이지까지 나와야함..
		
		int totalPage = totalCount / contentNum;
		if(totalCount%contentNum>0) {
			totalPage++;
		}
		return totalPage;
		
	}
	
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getContentNum() {
		return contentNum;
	}
	public void setContentNum(int contentNum) {
		this.contentNum = contentNum;
	}
	public int getStartPage() {
		return startPage;
	}
	public void setStartPage(int currentBlock) {
		this.startPage = (currentBlock*5)-4;//한블록에 5개를 표시
		//1블록 1,2,3,4,5
		//2블록 6,7,8,9,10
	}
	public int getEndPage() {
		return endPage;
	}
	public void setEndPage(int getLastBlock, int getCurrentBlock) {
		
		if( getLastBlock == getCurrentBlock) {//마지막페이지 블록번호가 현재페이지 블록 번화 같으면
			this.endPage = calcpage(getTotalCount(), getContentNum());//전체페이지 수가 마지막페이지
		}
		else {//그걸 제외한 경우엔 블록의 시작페이지를 구하고 +4를 해주면 블록의 마지막 페이지를 구할 수 있음
			this.endPage = getStartPage()+4;
		}
	}
/*	public boolean isPrev() {
		return prev;
	}
	public void setPrev(boolean prev) {
		this.prev = prev;
	}
	public boolean isNext() {
		return next;
	}
	public void setNext(boolean next) {
		this.next = next;
	}*/
	public int getCurrentBlock() {
		return currentBlock;
	}
	public void setCurrentBlock(int pageNum) { //현재페이지블록번호 구하기
		
		//현재 페이지번호 / 페이지블록안의 페이지개수
		//8page일 경우 8 / 5 => 1.6 (형변환)=>1 + 1 =2 현재페이지 블록은 2블록,,
		this.currentBlock = pageNum/5;
		if(pageNum%5>0) {
			this.currentBlock++;
		}
	}
	public int getLastBlock() {
		return lastBlock;
	}
	public void setLastBlock(int totalCount) {
		//한 페이지에 게시글을 10개 표시하고
		//전체 게시글이 125일 때 / 페이지게시글(10)*불록당페이지수(5) 50 =>2.5  +1  페이지블록이 3까지 있음.
		this.lastBlock = totalCount / (5*this.contentNum);
		
		if(totalCount%(5*this.contentNum)>0) {
			this.lastBlock++;
		}
	}
	
	
	
}
