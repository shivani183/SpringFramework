package test;

import java.io.IOException;
import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import krishna.comp.Voter;

public class ClientApp {

	public static void main(String[] args) throws IOException {

		System.out.println("ApplicationContext container starting..");

		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("/config/applicaitonContext.xml");

		System.out.println("Bean id info " + Arrays.toString(factory.getBeanDefinitionNames()));
		Voter bean = factory.getBean(Voter.class);

		System.out.println(bean.checkVotingEligibility());

		factory.close();

		System.out.println("\nApplicationContext container stopped..");

	}

}
