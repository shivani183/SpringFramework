package test;

import java.io.IOException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import commons.PersonInfo;

public class ClientApp {
	
	public static void main(String[] args) throws IOException{
		System.out.println("....container started....");
		
		ApplicationContext context=new ClassPathXmlApplicationContext("/config/applicaitonContext.xml");
		
		PersonInfo personInfo = context.getBean(PersonInfo.class);
		System.out.println(personInfo);
		
		((AbstractApplicationContext) context).close();	}

}
