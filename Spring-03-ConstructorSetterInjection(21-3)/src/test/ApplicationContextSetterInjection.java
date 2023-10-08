package test;

import java.io.IOException;
import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import comp.WishMessageGenerator;

public class ApplicationContextSetterInjection {

	public static void main(String[] args) throws IOException {

		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("/config/applicaitonContext.xml");

		System.out.println("No of beans :: " + factory.getBeanDefinitionCount());
		System.out.println("Bean id is :: " + Arrays.toString(factory.getBeanDefinitionNames()));

		WishMessageGenerator wmg = factory.getBean("wmg", WishMessageGenerator.class);
		System.out.println("\n" + wmg);
		factory.close();

	}

}
