package comp;

public class firstFlight implements Courier {

	static {
		System.out.println("\nfirstFlight.class file is loading..");
	}
	
	public firstFlight(){
		System.out.println("firstFlight :: Zero param constructor..");
	}
	
	@Override
	public String deliver(int oid) {
		System.out.println("firstFlight.deliver()");

		return "firstFlight courier will be delivered with the order id " + oid + " for the ordered products";
	}

}
