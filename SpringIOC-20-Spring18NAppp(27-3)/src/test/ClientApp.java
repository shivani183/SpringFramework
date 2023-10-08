package test;

import java.io.IOException;


import java.util.Arrays;
import java.util.Locale;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.ResourceBundleMessageSource;


public class ClientApp {

	public static void main(String[] args) throws IOException {

		System.out.println("ApplicationContext container starting..");
		 

		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("/config/applicaitonContext.xml");
		
		//Locale locale = new Locale("fr", "FR");
		Locale locale = new Locale(args[0], args[1]); // commadline argument

		System.out.println(factory.getMessage("btn1.cap", null, locale));
		System.out.println(factory.getMessage("btn2.cap", null, locale));
		System.out.println(factory.getMessage("btn3.cap", null, locale));
		System.out.println(factory.getMessage("btn4.cap", null, locale));
		System.out.println();
		System.out.println(factory.getMessage("btn1.cap", new String[] {"student"}, locale));
		factory.close();
		
	}

}
