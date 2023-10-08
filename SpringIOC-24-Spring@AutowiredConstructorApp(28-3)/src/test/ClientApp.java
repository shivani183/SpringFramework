package test;

import java.io.IOException;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import comp.flipkart;


public class ClientApp {

	public static void main(String[] args) throws IOException {

		System.out.println("ApplicationContext container starting..");
		 

		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("/config/applicaitonContext.xml");
		
		 flipkart f=factory.getBean(flipkart.class);
		 System.out.println(f.doShopping(new String[] {"tissot", "omegha"}, new float[] {25000f, 32000f}));
		factory.close();
		
	}

}
