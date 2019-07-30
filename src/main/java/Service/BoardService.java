package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import Command.BoardUpdateCommand;
import Command.BoardWriteCommand;
import Model.BoardDTO;
import Model.Paging;
import Model.Search;
import Repository.BoardRepository;

public class BoardService {

	@Autowired
	private BoardRepository boardRepository;
	
	
	public Integer boardWrite(Model model, BoardWriteCommand bCommand) {
		Integer result = 0;
		
		BoardDTO bdto = new BoardDTO(bCommand.getBoardTitle(), bCommand.getBoardName(), bCommand.getBoardPass(), bCommand.getBoardContent());
		
		/*int boardReRef = boardRepository.getBoardReRef(bCommand);
		bCommand.setReNum((long) boardReRef);*/
		
		result = boardRepository.boardInsert(bdto);
		
		model.addAttribute("bdto", bdto);
		return result;
	}
	
	/*public BoardDTO boardReply(Model model, BoardWriteCommand bCommand) {
		
		
		BoardDTO bdto = new BoardDTO();
		
		BoardDTO replyInfo = boardRepository.boardReplyInfo(bCommand);

		System.out.println(replyInfo.getReSeq()+"djkfhajdhfjsk");
		bCommand.setBoardNum(replyInfo.getBoardNum());
		bCommand.setReNum(replyInfo.getReNum());
		bCommand.setReLev(replyInfo.getReLev());
		bCommand.setReSeq(replyInfo.getReSeq());
		
		
		int insertCnt = 0;
		insertCnt += boardRepository.updateBoardReSeq(bCommand);
		insertCnt += boardRepository.boardReplyInsert(bCommand);
		
		model.addAttribute("bdto", bdto);
		return bdto;
	}*/
	
	public void searchList(Search search, Model model,Paging  paging) {

		List<BoardDTO> list = boardRepository.searchList(paging,search);
		model.addAttribute("list", list);
		model.addAttribute("paging", paging);
		model.addAttribute("search", search);
	}

	public int getAllListCount(Search search) {
		// TODO Auto-generated method stub
		return boardRepository.getAllListCnt(search);
	}

	public BoardDTO boardDetail(int num) {
		
		return boardRepository.boardDetail(num);
	}
	public Integer boardUpdate(BoardUpdateCommand upCommand, Model model) {
		// TODO Auto-generated method stub
		Integer result = 0;
		
		BoardDTO bdto = new BoardDTO();
		bdto.setBoardNum(upCommand.getBoardNum());
		bdto.setBoardSubject(upCommand.getBoardTitle());
		bdto.setBoardContent(upCommand.getBoardContent());
		
		result = boardRepository.boardUpdate(bdto);
		
		model.addAttribute("bdto", bdto);
		return result;
	}	
	
	public void boardDelete(int num) {
		// TODO Auto-generated method stub
		boardRepository.boardDelete(num);
	}

	public List<BoardDTO> downList() {
		List<BoardDTO> list = boardRepository.downList();
		return list;
	}

	
}
