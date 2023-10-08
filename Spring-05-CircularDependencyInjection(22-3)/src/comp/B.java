package comp;

public class B {
	private A a;
	
	static {
		System.out.println("B.class file is loading");
	}
	
	public B() {
		System.out.println("B constructor :: 0 param");
	}
	
	public B(A a) {
		System.out.println("B constructor :: 1 param");
	}

	public void setA(A a) {
		this.a = a;
		System.out.println("B.setA()");
	}

	@Override
	public String toString() {
		return "B [a=" + a + "]";
	}

}
