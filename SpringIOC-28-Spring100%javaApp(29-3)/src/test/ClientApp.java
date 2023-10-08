package test;

import java.io.IOException;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import krishna.cfg.AppConfig;
import krishna.comp.WishMessageGenerator;

public class ClientApp {

	public static void main(String[] args) throws IOException {

		System.out.println("ApplicationContext container starting..");

		AnnotationConfigApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);

		System.out.println("Bean id info " + Arrays.toString(factory.getBeanDefinitionNames()));
		
		WishMessageGenerator bean = factory.getBean(WishMessageGenerator.class);
		
		System.out.println(bean.wishMessage("abhi"));

		factory.close();

		System.out.println("\nApplicationContext container stopped..");

	}

}
