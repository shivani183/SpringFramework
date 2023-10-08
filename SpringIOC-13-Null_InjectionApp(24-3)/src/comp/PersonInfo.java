package comp;

import java.util.Date;

public class PersonInfo {

	private Integer pid;
	private String pname;
	private String paddress;
	private Date dob;
	private Date doj;

	public PersonInfo(Integer pid, String pname, String paddress, Date dob, Date doj) {
		System.out.println("PersonInfo 5 param constructor");
		this.pid = pid;
		this.pname = pname;
		this.paddress = paddress;
		this.dob = dob;
		this.doj = doj;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	@Override
	public String toString() {
		return "PersonInfo [pid=" + pid + ", pname=" + pname + ", paddress=" + paddress + ", dob=" + dob + ", doj="
				+ doj + "]";
	}
}
