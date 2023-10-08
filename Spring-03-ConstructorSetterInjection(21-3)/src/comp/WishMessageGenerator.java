package comp;

import java.util.Date;
public class WishMessageGenerator {

	private Date date;

	static {
		System.out.println("\nWishMessageGenerator.class file is loading...");
	}

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator object is instantiated..: zero parameter");
	}

	public WishMessageGenerator(Date date) {
		this.date=date;
		System.out.println("WishMessageGenerator object is instantiated.. :one parameter");
		System.out.println(this);
	}
	public void setDate(Date date) {
		this.date = date;
		System.out.println("Setter method is called to perform Setter injection...");
		System.out.println(this);
	}

	

	public String toString() {
		return "WishMessageGenerator [date=" + date + "]";
	}

}