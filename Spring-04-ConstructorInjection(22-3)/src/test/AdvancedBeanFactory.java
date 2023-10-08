package test;

import java.io.IOException;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import comp.Student;

public class AdvancedBeanFactory {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {

		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("config/applicaitonContext.xml");
		System.out.println("***********container started**************");
		System.in.read();
		Student student1 = factory.getBean("std1", Student.class);

		System.out.println(student1);
		System.out.println("\n***********container started**************");

	}
}
