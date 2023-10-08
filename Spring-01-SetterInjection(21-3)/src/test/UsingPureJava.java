package test;

import comp.WishMessageGenerator;

public class UsingPureJava {

	public static void main(String[] args) {

		WishMessageGenerator generator = new WishMessageGenerator();
		System.out.println("target object " + generator);
		java.util.Date date = new java.util.Date();
		System.out.println("dependent object is " + date);
		generator.setDate(date);
		System.out.println("target object after dependency" + generator);

		System.out.println();

		String result = generator.generateMessage("shivani");
		System.out.println(result);
	}

}
