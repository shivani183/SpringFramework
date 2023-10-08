package krishna.vo;

public class ResultVO {
	private String studentName;
	private String studentAddress;
	private String physicsMarks;
	private String bioMarks;
	private String mathsMarks;
	private String maximumMarks;
	
	static {
		System.out.println("ResultVO.class file is loading...");
	}

	public ResultVO() {
		System.out.println("ResultVO object is instantiated...");
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public String getStudentName() {
		return studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public String getPhysicsMarks() {
		return physicsMarks;
	}
	public String getBioMarks() {
		return bioMarks;
	}
	public String getMathsMarks() {
		return mathsMarks;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}


	public void setPhysicsMarks(String physicsMarks) {
		this.physicsMarks = physicsMarks;
	}


	public void setBioMarks(String bioMarks) {
		this.bioMarks = bioMarks;
	}


	public void setMathsMarks(String mathsMarks) {
		this.mathsMarks = mathsMarks;
	}
	public String getMaximumMarks() {
		return maximumMarks;
	}
	public void setMaximumMarks(String maximumMarks) {
		this.maximumMarks = maximumMarks;
	}
	@Override
	public String toString() {
		return "ResultVO [studentName=" + studentName + ", studentAddress=" + studentAddress + ", physicsMarks="
				+ physicsMarks + ", bioMarks=" + bioMarks + ", mathsMarks=" + mathsMarks + ", maximumMarks="
				+ maximumMarks + "]";
	}


}
