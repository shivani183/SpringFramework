package test;

import java.io.IOException;
import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import comp.WishMessageGenerator;

public class ApplicationContextConstructorInjection {

	public static void main(String[] args) throws IOException {


		System.out.println("ApplicationContext container starting..");
		

		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("/config/applicaitonContext.xml");
		
		System.out.println("No of beans :: "+ factory.getBeanDefinitionCount() );
		System.out.println("Bean id is :: "+ Arrays.toString(factory.getBeanDefinitionNames()) );
		
		System.out.println("ApplicationContext container started..");
		System.in.read();
		
		WishMessageGenerator wmg= factory.getBean("wishMessageGenerator", WishMessageGenerator.class);
		System.out.println("Hashcode value of wmg :: "+ wmg.hashCode());
		System.out.println(wmg+"\n");
		String user = wmg.generateMessage("shivani");
		System.out.println(user);
		System.out.println();
		
		WishMessageGenerator wmg1= factory.getBean("wmg", WishMessageGenerator.class);
		System.out.println("Hashcode value of wmg :: "+ wmg1.hashCode());
		System.out.println(wmg1+"\n");
		String user1 = wmg
				.generateMessage("Avinash");
		
		System.out.println(user1);
		System.out.println("Container is closing...");
		
	}

}
