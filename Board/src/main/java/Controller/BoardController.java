package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import Command.BoardUpdateCommand;
import Command.BoardWriteCommand;
import Model.BoardDTO;
import Model.Paging;
import Model.Search;
import Service.BoardService;

@Controller
public class BoardController {

	@Autowired
	private BoardService boardService;
	
	//글 등록 페이지
	@RequestMapping(value="/BoardWriteForm", method=RequestMethod.GET)
	public String form() {
		
		return "/Board/Write";
	}
	@RequestMapping(value="/BoardWrite" ,method=RequestMethod.POST)
	public String write(Model model, BoardWriteCommand bCommand) {
		boardService.boardWrite(model,bCommand);
		return "redirect:/BoardList";
	}
	
	//글 리스트 페이지
	@RequestMapping(value="/BoardList", method=RequestMethod.GET)
	public String list(Model model,@RequestParam(required=false, defaultValue="title")String searchType, 
									@RequestParam(required=false) String keyword,
									@ModelAttribute Search page) {
		
		Search search = new Search();
		search.setSearchType(searchType);
		search.setKeyword(keyword);
		
		if(page.getPage()==0) {
			page.setPage(1);
		}
		Paging paging = new Paging (page.getPage(),5,5);
		paging.setListCount(boardService.getAllListCount(search));
	
		boardService.searchList(search,model, paging);
		
		return "Board/List";
	}
	
	
	//글 상세페이지
	@RequestMapping(value="/BoardDetail", method=RequestMethod.GET)
	public String detail(@RequestParam("num") int num, Model model, @ModelAttribute("search") Search search) {
		
		
		BoardDTO board = boardService.boardDetail(num);
		model.addAttribute("board",board);
		model.addAttribute("search", search);
		
		return "Board/Detail";
		
	}
	
	
	//글 수정
	@RequestMapping(value="/BoardUpdate", method=RequestMethod.GET)
	public String update1(@RequestParam("num") int num, Model model) {
		BoardDTO board = boardService.boardDetail(num);
		model.addAttribute("board",board);
		return "/Board/Update";
	}
	@RequestMapping(value="/BoardUpdate", method=RequestMethod.POST)
	public String update(BoardUpdateCommand upCommand, Model model) {
		boardService.boardUpdate(upCommand, model);		
		return "redirect:/BoardList";	
	}
	
	
	//글 삭제
	@RequestMapping(value="/BoardDelete", method=RequestMethod.GET)
	public String delete(@RequestParam("num") int num) {
		
		boardService.boardDelete(num);
		return "redirect:/BoardList";
	}
}


















