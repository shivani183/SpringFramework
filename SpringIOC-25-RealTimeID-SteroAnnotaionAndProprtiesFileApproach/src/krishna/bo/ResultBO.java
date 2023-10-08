package krishna.bo;

public class ResultBO {
	private String studentName;
	private String studentAddress;
	private Float physicsMarks;
	private Float bioMarks;
	private Float mathsMarks;
	private Float percentage;
	private Float maximumMarks;

	

	public String getStudentName() {
		return studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public Float getPhysicsMarks() {
		return physicsMarks;
	}

	public Float getBioMarks() {
		return bioMarks;
	}

	public Float getMathsMarks() {
		return mathsMarks;
	}

	public Float getPercentage() {
		return percentage;
	}

	public void setPercentage(Float percentage) {
		this.percentage = percentage;
	}

	static {
		System.out.println("ResultVO.class file is loading...");
	}

	public ResultBO() {
		System.out.println("ResultVO object is instantiated...");
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void setPhysicsMarks(Float physicsMarks) {
		this.physicsMarks = physicsMarks;
	}

	public void setBioMarks(Float bioMarks) {
		this.bioMarks = bioMarks;
	}

	public void setMathsMarks(Float mathsMarks) {
		this.mathsMarks = mathsMarks;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public Float getMaximumMarks() {
		return maximumMarks;
	}

	public void setMaximumMarks(Float maximumMarks) {
		this.maximumMarks = maximumMarks;
	}

	@Override
	public String toString() {
		return "ResultBO [studentName=" + studentName + ", studentAddress=" + studentAddress + ", physicsMarks="
				+ physicsMarks + ", bioMarks=" + bioMarks + ", mathsMarks=" + mathsMarks + ", percentage=" + percentage
				+ ", maximumMarks=" + maximumMarks + "]";
	}



}
