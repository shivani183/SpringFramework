package comp;

public class blueDart implements Courier {

	static {
		System.out.println("\nblueDart.class file is loading..");
	}

	public blueDart() {
		System.out.println("blueDart :: Zero param constructor..");
	}

	@Override
	public String deliver(int oid) {
		System.out.println("blueDart.deliver()");

		return "blueDart courier will be delivered with the order id " + oid + "for the ordered products";

	}

}
