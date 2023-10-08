package test;

import java.util.Date;

import comp.WishMessageGenerator;

public class UsingPureJava {

	public static void main(String[] args) {

		Date date = new java.util.Date();
		System.out.println("Creating an Object of Dependant class using Zero param constructor :: " + date);

		WishMessageGenerator wmg = new WishMessageGenerator(date);
		System.out.println("Creating an object of Target class using parameterized constructor.." + wmg);

		String result = wmg.generateMessage("kohli");
		System.out.println(result);

	}

}
