package krishna.service;

import krishna.dto.CustomerDTO;

public interface ICustomerMgmntService {
	public String calcuateSimpleInterest(CustomerDTO dto) throws Exception;
}