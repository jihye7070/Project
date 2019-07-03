package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import Commend.OptionCommand;
import Commend.OptionRegisterCommand;
import Model.OptionDTO;
import Repository.OptionRepository;

public class OptionService {

	@Autowired
	private OptionRepository optionRepository;
	private  String kind;
	String path;
	
	public String optionInsert(OptionRegisterCommand command, Model model) {
		// TODO Auto-generated method stub
		Integer result = 0;
		
		OptionDTO odto = new OptionDTO(command.getOptionProduct(),command.getOptionPrice(),command.getOptionSoration());
		
		result = optionRepository.optionInsert(odto);
		if(result==1) {
	    path ="RegisterComplete";
		return path;
		}
		return null;
	}
	
	public void option(OptionCommand command, Model model) {
	    
		kind=command.getProductType();
	  List<OptionDTO> opt=optionRepository.option(kind);
	  System.out.println(kind);
	 if(kind.equals("축제") || kind.equals("영화")) {
		 model.addAttribute("command", command);
	}else {
	String[] kind=command.getProductType().split(",");
		opt=optionRepository.option(kind[0]);
	 String name[]= command.getProductName().split(",");
	 String type[]=command.getProductType().split(",");
	 String pNume[]=command.getProductNum().split(",");
	 String price[]=command.getOptionPrice().split(",");
	 String img[]=command.getOptionimg().split(",");
	 String seat[]=command.getOptionSeat().split(",");
	 String time[]=command.getOptionTime().split(",");
	 command.setOptionimg(img[command.getCount()-1]);
	 command.setOptionPrice(price[command.getCount()-1]);
	 command.setOptionSeat(seat[command.getCount()-1]);
	 command.setProductName(name[command.getCount()-1]);
	 command.setProductNum(pNume[command.getCount()-1]);
	 command.setProductType(type[command.getCount()-1]);
	 command.setOptionTime(time[command.getCount()-1]);
	 model.addAttribute("command", command);
	 }
	 model.addAttribute("opt",opt);
	}

	

	public void optionList(Model model) {
		List<OptionDTO> options = optionRepository.optionList();
		model.addAttribute("options",options);
		
	}



}
