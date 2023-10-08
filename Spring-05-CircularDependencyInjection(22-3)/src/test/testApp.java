package test;

import java.io.IOException;


import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import comp.A;
import comp.B;

public class testApp {

	public static void main(String[] args) throws IOException {
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
	    reader.loadBeanDefinitions("config/applicaitonContext.xml");

	    System.out.println("******** Container Started *********");
	    System.in.read();
	    
	    A objA =factory.getBean("a1", A.class);
	    B objB = factory.getBean("b1", B.class);
	    
	    System.out.println("******** Container Stopped *********");
	    
	}
}
