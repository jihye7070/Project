package Service;

import org.springframework.beans.factory.annotation.Autowired;

import Model.AnswerDTO;
import Repository.CustomerServiceRepository;

public class CustomerServiceAnswerSerivce {
	@Autowired
	private CustomerServiceRepository customerserviceRepository;
	
	/*public Integer answer(AnswerDTO answerdto) {
		// TODO Auto-generated method stub
		return customerserviceRepository.answer(answerdto);
	}*/

}
