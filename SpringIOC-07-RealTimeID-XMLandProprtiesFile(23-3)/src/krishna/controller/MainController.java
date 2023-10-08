package krishna.controller;

import krishna.dto.CustomerDTO;
import krishna.service.ICustomerMgmntService;
import krishna.vo.CustomerVO;

public class MainController {

	private ICustomerMgmntService service;

	public MainController(ICustomerMgmntService service) {
		this.service = service;
		System.out.println("MainController:: One param constructor----->" + service.getClass().getName());
	}

	public String processCustomer(CustomerVO vo) throws Exception {

		CustomerDTO customerDTO = new CustomerDTO();

		customerDTO.setCustomerAddress(vo.getCustomerAddress());
		customerDTO.setCustomerName(vo.getCustomerName());
		customerDTO.setPamt(Float.parseFloat(vo.getPamt()));
		customerDTO.setRate(Float.parseFloat(vo.getRate()));
		customerDTO.setTime(Float.parseFloat(vo.getTime()));

		String result = service.calcuateSimpleInterest(customerDTO);

		return result;
	}

}
