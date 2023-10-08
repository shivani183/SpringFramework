package test;

import java.io.IOException;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import comp.Printer;


public class ApplicationContextSetterInjection {

	public static void main(String[] args) throws IOException {

		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("/config/applicaitonContext.xml");

		System.in.read();
		
		Printer p1 = factory.getBean("wmg", Printer.class);
		System.out.println("Printer.HashCode :: "+p1.hashCode());
		
		Printer p2 = factory.getBean("wmg", Printer.class);
		System.out.println("Printer.HashCode :: "+p2.hashCode());
		
		factory.close();

	}

}
