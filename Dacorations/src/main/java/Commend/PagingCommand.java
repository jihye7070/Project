package Commend;

public class PagingCommand {
	   private String searchSet;
	   private String query;
	   private int page;
	   
	   public String getSearchSet() {
	      return searchSet;
	   }
	   public PagingCommand setSearchSet(String searchSet) {
	      this.searchSet = searchSet;
	      return this;
	   }
	   public String getQuery() {
	      return query;
	   }
	   public PagingCommand setQuery(String query) {
	      this.query = query;
	      return this;
	   }
	   public int getPage() {
	      return page;
	   }
	   public PagingCommand setPage(int page) {
	      this.page = page;
	      return this;
	   }
}
