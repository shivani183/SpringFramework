package comp;

public class Student {

	private Integer sno;
	private String sname;
	private String saddress;
	private Float avg;
	
	static {
		System.out.println("Student.class is loading..");
	}
	
	public Student(Integer sno, String sname, String saddress, Float avg) {
		this.sno = sno;
		this.sname = sname;
		this.saddress = saddress;
		this.avg = avg;
		System.out.println("four param constructor");
	}


	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", saddress=" + saddress + ", avg=" + avg + "]";
	}
	
}
