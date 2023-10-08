package krishna.service;

import krishna.bo.CustomerBO;
import krishna.dao.ICustomerDAO;
import krishna.dto.CustomerDto;

public class CustomerMgntServiceImpl implements ICustomerMgntService {

	ICustomerDAO dao;
	
	public CustomerMgntServiceImpl(ICustomerDAO dao) {
		this.dao = dao;
		System.out.println("CustomerMgntServiceImpl : 1param constructor ----> "+dao.getClass().getName());
	}

	@Override
	public String calculateSimpleInterest(CustomerDto dto) throws Exception {
		
		float intrAmount = (dto.getPamt()* dto.getRate()* dto.getTime())/100.0f;
		CustomerBO customerBO = new CustomerBO();
		customerBO.setCustomerAddress(dto.getCustomerAddress());
		customerBO.setCustomerName(dto.getCustomerName());
		customerBO.setRate(dto.getRate());
		customerBO.setTime(dto.getTime());
		customerBO.setPamt(dto.getPamt());
		customerBO.setIntrAmount(intrAmount);
		int count= dao.save(customerBO);
		
		return count==0? "customer registration failed" : "customer registration successful ---> "+ intrAmount;
	}

	@Override
	public String toString() {
		return "CustomerMgntServiceImpl [dao=" + dao + "]";
	}

}
