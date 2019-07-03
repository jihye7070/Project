package Repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import Model.OptionDTO;
import Model.OrderDTO;
import Model.OrderDetailDTO;
import Model.PaymentDTO;

public class OrderRepository {
	
	@Autowired
	private SqlSession sqlSession;
	
	//
	public int orderNum() {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("OrderMapper.orderNum");
	}

	public int orderInsert(OrderDTO odto) {
		// TODO Auto-generated method stub
		return sqlSession.insert("OrderMapper.orderInsert" ,odto);
	}
	public int orderListInsert(OrderDTO odto) {
		// TODO Auto-generated method stub
		System.out.println(odto.getOrderNum()+"너무하네");
		return sqlSession.insert("OrderMapper.orderList" ,odto);
	}
	
	public int payMentInsert(PaymentDTO pdto) {
		// TODO Auto-generated method stub
		System.out.println(pdto.getCardName()+"카드이름");
		System.out.println(pdto.getCardNum()+"카드번호");
		System.out.println(pdto.getCardTerm()+"할부기간");
		System.out.println(pdto.getOrderNum()+"주문번호");
		System.out.println(pdto.getPayPrice()+"음식가격");
		return sqlSession.insert("OrderMapper.payMentInsert" ,pdto);
	}
	public int option(OptionDTO opto) {
		// TODO Auto-generated method stub
		return sqlSession.insert("OrderMapper.option" ,opto);
	}
	public List<String> orderSeat(Long num) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("OrderMapper.orderSeat" ,num);
	}

	public List<OrderDetailDTO> searchOrder(String id) {
		// TODO Auto-generated method stub
		System.out.println(id);
		return sqlSession.selectList("OrderMapper.searchOrder" ,id);
	}

	public List<OrderDetailDTO> searchOrderAD(String id) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("OrderMapper.searchOrderAD" ,id);
	}


	
}
