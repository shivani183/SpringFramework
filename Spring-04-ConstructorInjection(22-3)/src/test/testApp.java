package test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import comp.Student;

public class testApp {
 @SuppressWarnings("deprecation")
public static void main(String[] args) {
	 
	 
	 FileSystemResource resource = new FileSystemResource("src/config/applicaitonContext.xml");
     XmlBeanFactory factory = new XmlBeanFactory(resource);
     
     Student student1 = factory.getBean("std1", Student.class);
 
     System.out.println(student1);
     
     Student student2 = factory.getBean("std2", Student.class);
     
     System.out.println(student2);
     
     Student student3 = factory.getBean("std3", Student.class);
     
     System.out.println(student3);

     Student student4 = factory.getBean("std4", Student.class);
     
     System.out.println(student4);
 }
}
