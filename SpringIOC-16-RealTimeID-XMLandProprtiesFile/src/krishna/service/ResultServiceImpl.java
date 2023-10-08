package krishna.service;

import krishna.bo.ResultBO;
import krishna.dao.IResultDAO;
import krishna.dto.ResultDTO;

public class ResultServiceImpl implements IResultService {

	private IResultDAO dao;


	public ResultServiceImpl(IResultDAO dao) {
		this.dao = dao;
		System.out.println("ResultServiceImpl:: 1 param constructor----> " + dao.getClass().getName());

	}

	public String calcuatePercentage(ResultDTO dto) throws Exception {

		float percentage = ((dto.getBioMarks()+dto.getMathsMarks()+dto.getPhysicsMarks())/dto.getMaximumMarks())*100.0f;

		ResultBO resultBO = new ResultBO();
		resultBO.setStudentName(dto.getStudentName());
		resultBO.setStudentAddress(dto.getStudentAddress());
		resultBO.setBioMarks(dto.getBioMarks());
		resultBO.setMathsMarks(dto.getMathsMarks());
		resultBO.setMaximumMarks(dto.getMaximumMarks());
		resultBO.setPhysicsMarks(dto.getPhysicsMarks());
		resultBO.setPercentage(percentage);
		int count = dao.save(resultBO);

		return count == 0 ? "student result loading failed"
				: "student result loading succesfull---->Percentage obtained ::" + percentage;
	}

}
