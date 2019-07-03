package Controller.CustomerserviceController;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import Model.AnswerDTO;
import Model.ChargerDTO;
import Model.CustomerserviceDTO;
import Service.CustomerServiceBoardService;
import Service.CustomerserviceService;

@Controller
public class CustomerserviceController {
	//고객센터 메인 컨트롤러
	
	@Autowired
	private CustomerserviceService customerserviceservice;
	public CustomerserviceController(CustomerserviceService customerserviceservice) {
		this.customerserviceservice = customerserviceservice;
	}
	
	

	@RequestMapping(value="CustomerMain", method = RequestMethod.GET)
	public String form(Model model,CustomerserviceDTO dto) {
		List<CustomerserviceDTO> customerservice = customerserviceservice.alllist(dto);
		
		//공지
		List<CustomerserviceDTO> notice = customerserviceservice.noticelist(dto);
		model.addAttribute("customerservice", customerservice);
		model.addAttribute("notice", notice);
		return "Customerservice/Customerservice";
	}
}
