package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import Model.ChargerDTO;
import Model.CustomerserviceDTO;
import Model.MemberDTO;
import Repository.CustomerServiceRepository;

public class CustomerserviceService {
	@Autowired
	private CustomerServiceRepository customerserviceRepository;
	public List<CustomerserviceDTO> alllist(CustomerserviceDTO dto) {
		// TODO Auto-generated method stub
		return customerserviceRepository.alllist(dto);
	}
	public List<CustomerserviceDTO> noticelist(CustomerserviceDTO dto) {
		// TODO Auto-generated method stub
		return customerserviceRepository.notice(dto);
	}
	

}
