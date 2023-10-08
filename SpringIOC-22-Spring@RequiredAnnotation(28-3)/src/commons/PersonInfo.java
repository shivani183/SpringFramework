package commons;

import org.springframework.beans.factory.annotation.Required;

public class PersonInfo {
	private int pid;
	private String pname;
	private int page;
	
	static {
		System.out.println("PersonInfo.class file is loading..");
	}
	public PersonInfo() {
		System.out.println("PersonInfo : Zero arg constructor");
	}
	public int getPid() {
		return pid;
	}
	
	@Required
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	
	@Required
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	@Override
	public String toString() {
		return "PersonInfo [pid=" + pid + ", pname=" + pname + ", page=" + page + "]";
	}


	
}
