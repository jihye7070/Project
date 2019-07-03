package Service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import Commend.OrderCommand;
import Model.MemberDTO;
import Model.OptionDTO;
import Model.OrderDTO;
import Model.OrderDetailDTO;
import Model.PaymentDTO;
import Repository.OrderRepository;

public class OrderService {
     private int orderNum;
     private String cardNum;
     private String []optionNm;
     private int optionNum;
	
	@Autowired
	private OrderRepository orderRepository;
	
	
	public Integer addOption(Model model, OrderCommand command,HttpSession session) {
		// TODO Auto-generated method stub
		Integer result = 0;
		 orderNum=orderRepository.orderNum();
		 optionNm=command.getOption().split("\\+");
		 optionNum=Integer.parseInt(optionNm[0]);
		 cardNum=command.getCardNum()[0]+"-"+command.getCardNum()[1]+"-"+command.getCardNum()[2];
		MemberDTO mDto=(MemberDTO) session.getAttribute("memberDTO");

		OrderDTO odto = new OrderDTO(command.getProductNum(), command.getCategoryNum(),
							command.getOptionTime(), command.getOptionCheckin(), command.getOptionCheckout(),command.getOptionSeat(),
							command.getName(), command.getTell(),mDto.getMemberId(),command.getOptionDate());
		odto.setOrderNum(orderNum);
		PaymentDTO pdto= new PaymentDTO(orderNum,cardNum,command.getOptionPrice(),command.getCardTerm(),command.getCardName());
		OptionDTO opto=new OptionDTO();
		opto.setOrderNum(orderNum);
		opto.setOptionNum(optionNum);
		System.out.println(odto.getProductNum()+"이거안돼");
		result = orderRepository.orderInsert(odto);
		orderRepository.orderListInsert(odto);
		orderRepository.option(opto);
		orderRepository.payMentInsert(pdto);
		
		
		return result;
	}


	public void orderDetail(Model model, Long num, HttpSession session) {
		/*
		1- 영화
  		2- 레스토랑
  		3- 숙소
  		4- 축제*/
		
		MemberDTO mDto = (MemberDTO) session.getAttribute("memberDTO");
		String id = mDto.getMemberId();
		if(num==2) {
			List<OrderDetailDTO> list = orderRepository.searchOrder(id);
		
			model.addAttribute("list",list);
		}
		
		if(num==3) {
			List<OrderDetailDTO> list = orderRepository.searchOrderAD(id);
		
			model.addAttribute("list",list);
		}
	}

}
