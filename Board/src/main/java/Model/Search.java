package Model;

public class Search {
	
	private String searchType;
	private String keyword;
	private int page;
	
	public int getPage() {
		return page;
	}
	public Search setPage(int page) {
		this.page = page;
		return this;
	}
	
	public String getSearchType() {
		return searchType;
	}
	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}	

	
}
