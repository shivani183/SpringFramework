package krishna.service;

import krishna.dto.CustomerDto;

public interface ICustomerMgntService {

	public String calculateSimpleInterest(CustomerDto dto)throws Exception;
}
