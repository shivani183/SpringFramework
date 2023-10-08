package test;

import java.io.IOException;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

import comp.College;


public class ApplicationContextSetterInjection {

	public static void main(String[] args) throws IOException {


		ApplicationContext factory = new ClassPathXmlApplicationContext("/config/applicaitonContext.xml");
		College bean = factory.getBean("CS", College.class);
		System.out.println(bean);
		((AbstractApplicationContext)factory).close();
	}

}
