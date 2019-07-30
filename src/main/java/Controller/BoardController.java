package Controller;


import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor.HSSFColorPredefined;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

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
	public String write(Model model, BoardWriteCommand bCommand, HttpServletRequest req, HttpServletResponse rep) {


		String path = "c://upload"; 
		Map returnObject = new HashMap();
		
		try {
			MultipartHttpServletRequest mhsr = (MultipartHttpServletRequest) req; 
			Iterator iter = mhsr.getFileNames(); 
			MultipartFile mfile = null; 
			String fieldName = ""; 
			List resultList = new ArrayList(); // 디레토리가 없다면 생성

			File dir = new File(path); 
			if (!dir.isDirectory()) { 
				dir.mkdirs(); 
			} 
			// 값이 나올때까지 
			while (iter.hasNext()) {
				fieldName = (String) iter.next(); 
				// 내용을 가져와서 
				mfile = mhsr.getFile(fieldName); 
				String origName; 
				origName = new String(mfile.getOriginalFilename().getBytes("8859_1"), "UTF-8"); //한글꺠짐 방지 

				// 파일명이 없다면 
				if ("".equals(origName)) { 
					continue; 
				} 
				// 파일 명 변경(uuid로 암호화) 
				String ext = origName.substring(origName.lastIndexOf('.')); 
				// 확장자 
				String saveFileName = getUuid() + ext; 
				// 설정한 path에 파일저장 
				File serverFile = new File(path + File.separator + saveFileName); 
				mfile.transferTo(serverFile); 
				Map file = new HashMap(); 
				file.put("origName", origName); 
				file.put("sfile", serverFile); 
				resultList.add(file); 
				

			} 
			returnObject.put("files", resultList); 
			returnObject.put("params", mhsr.getParameterMap()); 
			

			boardService.boardWrite(model,bCommand);
			return "redirect:/BoardList";
		} catch (UnsupportedEncodingException e) { // TODO Auto-generated catch block 
			e.printStackTrace(); 
		}catch (IllegalStateException e) { // TODO Auto-generated catch block 
			e.printStackTrace(); 
		} catch (IOException e) { // TODO Auto-generated catch block 
			e.printStackTrace(); 
		} return null;


	}
	public static String getUuid() { 
		return UUID.randomUUID().toString().replaceAll("-", "");
		}


//엑셀  다운로드
@RequestMapping(value="/ExcelDownload", method=RequestMethod.GET)
public void download(HttpServletResponse response) throws IOException {
	List<BoardDTO> list = boardService.downList();

	// 워크북 생성
	Workbook wb = new HSSFWorkbook();
	Sheet sheet = wb.createSheet("게시판");
	Row row = null;
	Cell cell = null;
	int rowNo = 0;

	// 테이블 헤더용 스타일
	CellStyle headStyle = wb.createCellStyle();

	// 가는 경계선을 가집니다.
	headStyle.setBorderTop(BorderStyle.THIN);
	headStyle.setBorderBottom(BorderStyle.THIN);
	headStyle.setBorderLeft(BorderStyle.THIN);
	headStyle.setBorderRight(BorderStyle.THIN);
	// 배경색은 노란색입니다.
	headStyle.setFillForegroundColor(HSSFColorPredefined.CORAL.getIndex());
	headStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);

	// 데이터는 가운데 정렬합니다.
	headStyle.setAlignment(HorizontalAlignment.CENTER);

	// 데이터용 경계 스타일 테두리만 지정
	CellStyle bodyStyle = wb.createCellStyle();
	bodyStyle.setBorderTop(BorderStyle.THIN);
	bodyStyle.setBorderBottom(BorderStyle.THIN);
	bodyStyle.setBorderLeft(BorderStyle.THIN);
	bodyStyle.setBorderRight(BorderStyle.THIN);

	// 헤더 생성
	row = sheet.createRow(rowNo++);
	cell = row.createCell(0);
	cell.setCellStyle(headStyle);
	cell.setCellValue("글 번호");
	cell = row.createCell(1);
	cell.setCellStyle(headStyle);
	cell.setCellValue("작성자");
	cell = row.createCell(2);
	cell.setCellStyle(headStyle);
	cell.setCellValue("글 제목");
	cell = row.createCell(3);
	cell.setCellStyle(headStyle);
	cell.setCellValue("작성일");



	// 데이터 부분 생성
	for(BoardDTO vo : list) {
		row = sheet.createRow(rowNo++);
		cell = row.createCell(0);
		cell.setCellStyle(bodyStyle);
		cell.setCellValue(vo.getBoardNum());
		cell = row.createCell(1);
		cell.setCellStyle(bodyStyle);
		cell.setCellValue(vo.getBoardName());
		cell = row.createCell(2);
		cell.setCellStyle(bodyStyle);
		cell.setCellValue(vo.getBoardSubject());
		cell = row.createCell(3);
		cell.setCellStyle(bodyStyle);

		Date date = vo.getBoardDate();
		SimpleDateFormat date2 = new SimpleDateFormat("yyyy.MM.dd");
		cell.setCellValue(date2.format(date));
	}
	// 컨텐츠 타입과 파일명 지정
	response.setContentType("ms-vnd/excel");
	response.setHeader("Content-Disposition", "attachment;filename=excelDownload.xls");

	// 엑셀 출력
	wb.write(response.getOutputStream());
	wb.close();

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
	return "redirect:/BoardDetail?num="+upCommand.getBoardNum();	
}


//글 삭제
@RequestMapping(value="/BoardDelete", method=RequestMethod.GET)
public String delete(@RequestParam("num") int num) {

	boardService.boardDelete(num);
	return "redirect:/BoardList";


}

/*//글 답글 등록 페이지
	@RequestMapping(value="/BoardReplyForm", method=RequestMethod.GET)
	public String reply() {

		return "/Board/Reply";
	}
	@RequestMapping(value="/BoardReply" ,method=RequestMethod.POST)
	public String replyWrite(Model model, BoardWriteCommand bCommand) {
		boardService.boardReply(model,bCommand);
		return "redirect:/BoardList";
	}
 */
}


















