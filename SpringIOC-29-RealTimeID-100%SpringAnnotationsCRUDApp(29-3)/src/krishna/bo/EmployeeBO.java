package krishna.bo;

public class EmployeeBO {
	
	private Integer eid;
	private String ename;
	private Integer eage;
	private String eAddress;
	private Float eSalary;
	private Float hikeAmount;
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
	public Float geteSalary() {
		return eSalary;
	}
	public void seteSalary(Float eSalary) {
		this.eSalary = eSalary;
	}
	public Float getHikeAmount() {
		return hikeAmount;
	}
	public void setHikeAmount(Float hikeAmount) {
		this.hikeAmount = hikeAmount;
	}
	@Override
	public String toString() {
		return "EmployeeBO [eid=" + eid + ", ename=" + ename + ", eage=" + eage + ", eAddress=" + eAddress
				+ ", eSalary=" + eSalary + ", hikeAmount=" + hikeAmount + "]";
	}
	

}
