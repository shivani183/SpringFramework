package krishna.controller;

import krishna.dto.CustomerDto;
import krishna.service.ICustomerMgntService;
import krishna.vo.CustomerVo;

public class mainController {


	private ICustomerMgntService service;
	
	public mainController(ICustomerMgntService service) {
		this.service = service;
		System.out.println("mainController : 1 param constructor --> "+service.getClass().getName());
	}

	public String processCustomer(CustomerVo vo) throws Exception {
		CustomerDto customerDto = new CustomerDto();
		customerDto.setCustomerAddress(vo.getCustomerAddress());
		customerDto.setCustomerAddress(vo.getCustomerName());
		customerDto.setCustomerAddress(vo.getRate());
		customerDto.setCustomerAddress(vo.getTime());
		customerDto.setCustomerAddress(vo.getPamt());
		String result = service.calculateSimpleInterest(customerDto);
		return "result";
	}

	@Override
	public String toString() {
		return "mainController [service=" + service + "]";
	}
}
