package krishna.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import krishna.dto.ResultDTO;
import krishna.service.IResultService;
import krishna.vo.ResultVO;

@Component(value="controller")
public class MainController {

	@Autowired
	private IResultService service;
	
	static {
		System.out.println("MainController.class file is loading");
	}
	
	public MainController() {
		System.out.println("MainController: Zero argument constructor");
	}



	public String processResult(ResultVO vo) throws Exception {


		ResultDTO dto = new ResultDTO();
		dto.setStudentName(vo.getStudentName());
		dto.setStudentAddress(vo.getStudentAddress());;
		dto.setBioMarks(Float.parseFloat(vo.getBioMarks()));
		dto.setMathsMarks(Float.parseFloat(vo.getMathsMarks()));
		dto.setPhysicsMarks(Float.parseFloat(vo.getPhysicsMarks()));
		dto.setMaximumMarks(Float.parseFloat(vo.getMaximumMarks()));

		String result = service.calcuatePercentage(dto);

		return result;
	}
}
