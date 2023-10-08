package comp;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class flipkart {

	private Courier courier;
	private Float discount;

	static {
		System.out.println("\nflipkart.class file is loading..");
	}

	public flipkart() {
		System.out.println("flipkart :: Zero param constructor..");
	}
	
	@Autowired
	public flipkart(@Qualifier("dtdc") Courier courier, Float discount) {
		this.courier=courier;
		this.discount=discount;
		System.out.println("flipkart :: two param constructor..");
		System.out.println(this);
	}

	public String doShopping(String[] items, float prices[]) {
		System.out.println("flipkart.doShopping()");
		System.out.println("Implementation class is ::" + courier.getClass().getName());
		System.out.println("discount is ::" + discount);

		int oid = 0;
		float billAmt = 0.0f;
		Random random = null;
		for (float price : prices) {
			billAmt += price;
		}
		billAmt = billAmt - (discount / 100.0f);
		random = new Random();
		oid = random.nextInt(1000);
		String msg = courier.deliver(oid);
		return Arrays.toString(items) + " are purchased having prices " + Arrays.toString(prices)
				+ " with bill amount of " + billAmt + "-----> " + msg;
	}

	public void setCourier(Courier courier) {
		this.courier = courier;
		System.out.println("flipkart.setCourier()");
	}

	public void setDiscount(Float discount) {
		this.discount = discount;
		System.out.println("flipkart.setDiscount()");
	}

	@Override
	public String toString() {
		
		return "flipkart [courier=" + courier + ", discount=" + discount + "]";
	}

	

}
