package comp;

public class dtdc implements Courier {

	static {
		System.out.println("\ndtdc.class file is loading..");
	}
	
	public dtdc(){
		System.out.println("dtdc :: Zero param constructor..");
	}
	
	@Override
	public String deliver(int oid) {
		System.out.println("dtdc.deliver()");

		return "dtdc courier will be delivered with the order id " + oid + "for the ordered products";
	
	}

}
