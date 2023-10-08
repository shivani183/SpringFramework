package comp;

public class Student {

	private Integer sid;
	private String sname;
	private Integer sage;
	private String saddress;

	static {
		System.out.println("Student.class file is loading");
	}

	public Student() {
		System.out.println("Student obj instantiated");
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sage=" + sage + ", saddress=" + saddress + "]";
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public void setSage(Integer sage) {
		this.sage = sage;
	}

	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}

}
