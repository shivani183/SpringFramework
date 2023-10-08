package krishna.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import krishna.service.IEmplyeeService;
import krishna.vo.EmployeeVO;
import krishna.dto.EmployeeDTO;

@Component(value="controller")
public class MainController {
	
	static {
		System.out.println("MainController.class is loading..");
	}
	
	public MainController() {
		System.out.println("MainController:: zero arg constructor");
	}
	
	public EmployeeVO getHike(EmployeeVO vo) {
		
		EmployeeDTO dto = new EmployeeDTO();
		
		dto.seteAddress(vo.geteAddress());
		dto.setEage(vo.getEage());
		dto.setEname(vo.getEname());
		dto.seteSalary(Float.parseFloat(vo.geteSalary()));
		
		EmployeeDTO empDTO= service.calculateHike(dto);
		
		EmployeeVO empVO = new EmployeeVO();
		empVO.setEid(empDTO.getEid());
		empVO.seteAddress(empDTO.geteAddress());
		empVO.setEage(empDTO.getEage());
		empVO.setEname(empDTO.getEname());
		empVO.seteSalary(empVO.geteSalary());
		empVO.setHikeAmount(empDTO.getHikeAmount().toString());
		
		return empVO;
		
	}
	
	@Autowired
	private IEmplyeeService service;

	@Override
	public String toString() {
		return "MainController [service=" + service + "]";
	}
		
	

}
