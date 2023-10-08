package krishna.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import krishna.bo.ResultBO;
import krishna.dao.IResultDAO;
import krishna.dto.ResultDTO;

@Service(value="service")
public class ResultServiceImpl implements IResultService {

	@Autowired
	private IResultDAO dao;

	static {
		System.out.println("ResultServiceImpl.class file is loading");
	}
	
	public ResultServiceImpl() {
		System.out.println("ResultServiceImpl: Zero argument constructor");
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
