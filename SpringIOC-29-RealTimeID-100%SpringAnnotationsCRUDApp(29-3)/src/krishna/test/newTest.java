package krishna.test;

import krishna.config.AppConfig;

import org.springframework.context.annotation.*;
import org.springframework.context.support.AbstractApplicationContext;

import java.util.Scanner;

import org.springframework.context.*;
import krishna.controller.MainController;
import krishna.vo.EmployeeVO;

public class newTest {

	public static void main(String[] args) throws Exception {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter name");
		String ename=scan.next();
		
		System.out.println("Enter age");
		Integer eage=scan.nextInt();
		
		System.out.println("Enter Address");
		String eaddress= scan.next();
		
		System.out.println("Enter Salary");
		String esalary=scan.next();
		
		

		 ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		 
		 MainController bean = context.getBean(MainController.class);
		 
		 EmployeeVO vo = new EmployeeVO();
		 vo.seteAddress(eaddress);
		 vo.setEname(ename);
		 vo.setEage(eage);
		 vo.seteSalary(esalary);
		 EmployeeVO result = bean.getHike(vo);
		 System.out.println(result);
		 
		 System.out.println(bean);
		 
		 ((AbstractApplicationContext) context).close();

		
	}
}
