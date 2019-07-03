package Controller.CustomerserviceController;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import Commend.CustomerServiceCommand;
import Model.AnswerDTO;
import Model.ChargerDTO;
import Model.CustomerserviceDTO;
import Service.CustomerServiceAnswerSerivce;
import Service.CustomerServiceBoardService;

@Controller
public class CustomerserviceBoardController {
		// 공지사항,일대일 문의
		
		@Autowired
		private CustomerServiceBoardService customerserviceboardservice;
		public CustomerserviceBoardController(CustomerServiceBoardService customerserviceboardservice) {
			this.customerserviceboardservice = customerserviceboardservice;
		}
		
		//일대일 문의 글쓰기
		@RequestMapping(value="CustomerWrite", method = RequestMethod.GET)
		public String notice() {
			return "Notice/NoticeWrite";

		}
		@RequestMapping(value="CustomerWrite", method = RequestMethod.POST)
		public String notice(CustomerserviceDTO dto) {
			Integer result = customerserviceboardservice.insert(dto);
			return "redirect:/CustomerMain";

		}
		
		//일대일 문의 상세정보
		@RequestMapping(value="CustomerDetail", method = RequestMethod.GET)
		public String noticedetail(Model model,@RequestParam("fno") int num,HttpSession session) {
			CustomerserviceDTO detail = customerserviceboardservice.detail(num);
			
			
			//답변빼기
			AnswerDTO answerinfo = customerserviceboardservice.answerinfo(num);
			/*session.setAttribute("info", answerinfo);*/
			model.addAttribute("answerinfo", answerinfo);
			
			model.addAttribute("detail", detail); 
			model.addAttribute("num", num); 
			return "Notice/NoticeDetail";
		}
		
		//문의답변
		@RequestMapping(value="CustomerDetail", method = RequestMethod.POST)
		public String noticedetail(Model model,CustomerServiceCommand cus) {
			
			//답글쓰기
			Integer answer = customerserviceboardservice.answer(cus);
			System.out.println("담당자번호"+cus.getChargeNum());
			
			System.out.println("글번호"+cus.getBoardNum());
			//업데이트 (번호,관리자)
			Integer charno = customerserviceboardservice.InsertCnum(cus.getChargeNum(),cus.getBoardNum());
			
			model.addAttribute("answer", answer);
			return "redirect:/CustomerMain";
		}
	
		
	}


