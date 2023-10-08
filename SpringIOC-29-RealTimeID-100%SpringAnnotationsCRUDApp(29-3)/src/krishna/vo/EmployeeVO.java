package krishna.vo;

public class EmployeeVO {
	private Integer eid;
	private String ename;
	private Integer eage;
	private String eAddress;
	private String eSalary;
	private String hikeAmount;
	
	

	public Integer getEid() {
		return eid;
	}



	public void setEid(Integer eid) {
		this.eid = eid;
	}



	public String getEname() {
		return ename;
	}



	public void setEname(String ename) {
		this.ename = ename;
	}



	public Integer getEage() {
		return eage;
	}



	public void setEage(Integer eage) {
		this.eage = eage;
	}



	public String geteAddress() {
		return eAddress;
	}



	public void seteAddress(String eAddress) {
		this.eAddress = eAddress;
	}



	public String geteSalary() {
		return eSalary;
	}



	public void seteSalary(String eSalary) {
		this.eSalary = eSalary;
	}



	public String getHikeAmount() {
		return hikeAmount;
	}



	public void setHikeAmount(String hikeAmount) {
		this.hikeAmount = hikeAmount;
	}



	@Override
	public String toString() {
		return "EmployeeVO [eid=" + eid + ", ename=" + ename + ", eage=" + eage + ", eAddress=" + eAddress
				+ ", eSalary=" + eSalary + ", hikeAmount=" + hikeAmount + "]";
	}
}
