package test;

import java.io.IOException;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import comp.CollegeInfo;
import comp.ContactInfo;
import comp.MarksInfo;
import comp.UniversityInfo;


public class ApplicationContextSetterInjection {

	public static void main(String[] args) throws IOException {

		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("/config/applicaitonContext.xml");

		System.out.println("\n**************** Container Started *****************");
		System.out.println("\nBean id is :: " +Arrays.toString(factory.getBeanDefinitionNames()));
		System.out.println();

		MarksInfo result = factory.getBean("marksInfo",MarksInfo.class);
		System.out.println(result);
		System.out.println();
		
		CollegeInfo collegeInfo = factory.getBean("college", CollegeInfo.class);
		System.out.println(collegeInfo);
		
		System.out.println();

		ContactInfo contact = factory.getBean("contact", ContactInfo.class);
		System.out.println(contact);
		
		System.out.println();

		UniversityInfo bean = factory.getBean("university", UniversityInfo.class);
		System.out.println(bean);
		
		System.out.println("\n******************* Container closed **********************");
		
		factory.close();

	}

}
