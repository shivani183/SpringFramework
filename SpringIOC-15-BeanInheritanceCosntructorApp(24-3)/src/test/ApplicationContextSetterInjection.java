package test;

import java.io.IOException;



import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import comp.Car;


public class ApplicationContextSetterInjection {

	public static void main(String[] args) throws IOException {

		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("config/applicaitonContext.xml");

		System.out.println("\n**************** Container Started *****************");
		System.out.println("\nBean id is :: " +Arrays.toString(factory.getBeanDefinitionNames()));
		System.out.println();
		Car car1 = factory.getBean("car1", Car.class);
		System.out.println(car1);
		
		Car car2 = factory.getBean("car1", Car.class);
		System.out.println(car2);
		/*
		 * Car baseCar = factory.getBean("baseCar", Car.class);
		 * System.out.println(baseCar);
		 */
		
		System.out.println("\n******************* Container closed **********************");
		
		factory.close();

	}

}
