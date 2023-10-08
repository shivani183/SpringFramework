package krishna.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import krishna.dao.IEmployeeDAO;
import krishna.dto.EmployeeDTO;
import krishna.vo.EmployeeVO;
import krishna.bo.EmployeeBO;

@Service(value="service")
public class EmplyeeServiceImpl implements IEmplyeeService{

	@Autowired
	private IEmployeeDAO dao;
	
	static {
		System.out.println("EmplyeeServiceImpl.class is loading..");
	}
	
	public EmplyeeServiceImpl() {
		System.out.println("EmplyeeServiceImpl:: zero arg constructor");
	}

	@Override
	public String toString() {
		return "EmplyeeServiceImpl [dao=" + dao + "]";
	}

	@Override
	public EmployeeDTO calculateHike(EmployeeDTO dto) {
		EmployeeBO bo=new EmployeeBO();
		BeanUtils.copyProperties(dto, bo);
		bo.setHikeAmount(bo.geteSalary()+3000.0f);
		EmployeeBO empBO = dao.save(bo);
		EmployeeDTO empDto= new EmployeeDTO();
		BeanUtils.copyProperties(empBO, empDto);
		return empDto;
	}

}
