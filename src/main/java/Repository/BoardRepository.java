package Repository;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import Command.BoardWriteCommand;
import Model.BoardDTO;
import Model.Paging;
import Model.Search;

public class BoardRepository {
	@Autowired
	private SqlSession sqlSession;

	public Integer boardInsert(BoardDTO bdto) {
		// TODO Auto-generated method stub
		return sqlSession.insert("BoardMapper.boardInsert",bdto);
	}

	public int boardReplyInsert(BoardWriteCommand bCommand) {
		// TODO Auto-generated method stub
		return sqlSession.insert("BoardMapper.replyInsert",bCommand);
	}

/*	public Integer boardReplyInsert(BoardDTO bdto) {
		// TODO Auto-generated method stub
		return sqlSession.insert("BoardMapper.replyInsert",bdto);
	}*/


	public List<BoardDTO> searchList(Paging paging, Search search) {
		// TODO Auto-generated method stub
		Integer minNum = ((paging.getPage()-1)*paging.getLimit())+1;
		Integer maxNum = minNum+paging.getLimit()-1;
		HashMap<String, Object> mapping = new HashMap<String, Object>();
		mapping.put("minNum", minNum);
		mapping.put("maxNum", maxNum);
		mapping.put("keyword", search.getKeyword());
		mapping.put("searchType", search.getSearchType());
		return sqlSession.selectList("BoardMapper.searchList", mapping);
	}
	public int getAllListCnt(Search search) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("BoardMapper.listCnt", search);
	}

	
	public BoardDTO boardDetail(int num) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("BoardMapper.boardDetail", num);
	}

	public Integer boardUpdate(BoardDTO bdto) {
		// TODO Auto-generated method stub
		return sqlSession.update("BoardMapper.boardUpdate", bdto);
	}

	public void boardDelete(int num) {
		// TODO Auto-generated method stub
		sqlSession.delete("BoardMapper.boardDelete", num);
	}

	public boolean checkPass(String pass, int num) {
		// TODO Auto-generated method stub
		boolean result = false;
		HashMap<String, Object> map =  new HashMap<String, Object>();
		map.put("pass", pass);
		map.put("num", num);
		
		int count = sqlSession.selectOne("chechPass", map);
		if(count==1) result = true;
		return result;
	}
/*	public int getBoardReRef(BoardWriteCommand bCommand)  {

		return sqlSession.selectOne("BoardMapper.getBoardReRef", bCommand);
	}
	public BoardDTO boardReplyInfo(BoardWriteCommand bCommand) {
		// TODO Auto-generated method stub
		
		return sqlSession.selectOne("BoardMapper.replyInfo", bCommand);
	}

	public int updateBoardReSeq(BoardWriteCommand bCommand) {
		// TODO Auto-generated method stub
		return sqlSession.update("BoardMapper.updateReSeq", bCommand);
	}*/

	public List<BoardDTO> downList() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("BoardMapper.downList");
	}


	
	

}
