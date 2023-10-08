package krishna.controller;

import krishna.dto.ResultDTO;
import krishna.service.IResultService;
import krishna.vo.ResultVO;

public class MainController {

	private IResultService service;

	public MainController(IResultService service) {
		this.service = service;
		System.out.println("MainController:: One param constructor----->" + service.getClass().getName());
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
