package test;

import java.io.IOException;



import java.util.Arrays;
import java.util.Locale;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import commons.Employee;


public class ClientApp {

	public static void main(String[] args) throws IOException {

		System.out.println("ApplicationContext container starting..");
		 

		ApplicationContext factory = new ClassPathXmlApplicationContext("/config/applicaitonContext.xml");
		
		Employee bean = factory.getBean(Employee.class);
		System.out.println(bean);
		((AbstractApplicationContext) factory).close();
		
	}

}
