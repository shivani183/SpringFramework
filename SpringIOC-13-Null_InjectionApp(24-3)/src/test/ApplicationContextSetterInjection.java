package test;

import java.io.IOException;


import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import comp.PersonInfo;

public class ApplicationContextSetterInjection {

	public static void main(String[] args) throws IOException {

		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("/config/applicaitonContext.xml");

		System.out.println("\n**************** Container Started *****************");
		System.out.println("\nBean id is :: " +Arrays.toString(factory.getBeanDefinitionNames()));
		System.out.println();
		
		PersonInfo personInfo = factory.getBean("pinfo", PersonInfo.class);
		System.out.println(personInfo);
		
		System.out.println("\n******************* Container closed **********************");
		
		factory.close();

	}

}
