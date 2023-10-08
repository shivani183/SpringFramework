package comp;

public class A {

	private B b;
	
	static {
		System.out.println("A.class file is loading");
	}
	
	public A() {
		System.out.println("A constructor :: 0 param");
	}
	public A(B b) {
		System.out.println("A constructor :: 1 param");
	}

	public void setB(B b) {
		
		this.b = b;
		System.out.println("A.setB()");
	}

	@Override
	public String toString() {
		return "A [b=" + b + "]";
	}
	
	
}
