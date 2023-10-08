package test;

import java.io.IOException;


import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import comp.Student;


public class ApplicationContextSetterInjection {

	public static void main(String[] args) throws IOException {

		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("/config/applicaitonContext.xml");

		System.out.println("Bean id is :: " +Arrays.toString(factory.getBeanDefinitionNames()));
		System.in.read();
		
		Student student = factory.getBean("std1", Student.class);
		System.out.println(student);
		Student student1 = factory.getBean("std", Student.class);
		System.out.println(student1);
		factory.close();

	}

}
