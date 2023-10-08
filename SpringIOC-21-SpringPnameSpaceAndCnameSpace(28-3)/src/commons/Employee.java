package commons;
import java.util.*;

public class Employee {
	private int eno;
	private String ename;
	private Date dob;
	private Department dept;
	
	public int getEno() {
		return eno;
	}
	public String getEname() {
		return ename;
	}
	public Date getDob() {
		return dob;
	}
	public Department getDept() {
		return dept;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", dob=" + dob + ", dept=" + dept + "]";
	}
	
	

	

}
