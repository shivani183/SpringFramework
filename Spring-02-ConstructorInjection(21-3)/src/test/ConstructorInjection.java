package test;

import org.springframework.beans.factory.xml.XmlBeanFactory;

import org.springframework.core.io.FileSystemResource;

import comp.WishMessageGenerator;

public class ConstructorInjection {

	public static void main(String[] args) {

		FileSystemResource resourse = new FileSystemResource(
				"src/config/applicaitonContext.xml");

		System.out.println("Bean Factory container starting..");
		
		XmlBeanFactory factory = new XmlBeanFactory(resourse);
		
		System.out.println("Bean Factory container started..");
		
		WishMessageGenerator wmg=factory.getBean("wmg", WishMessageGenerator.class);
		System.out.println(wmg+"\n");
		String user = wmg.generateMessage("shivani");
		System.out.println(user);
		System.out.println();
		System.out.println("Container is closing...");
		
	}

}
