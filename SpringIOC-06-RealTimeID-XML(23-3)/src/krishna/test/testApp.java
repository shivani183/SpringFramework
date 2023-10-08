package krishna.test;

import java.io.IOException;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import krishna.controller.mainController;
import krishna.vo.CustomerVo;

public class testApp {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter customer name--");
		String customerNmae = scan.next();

		System.out.println("Enter customer address--");
		String customerAddress = scan.next();

		System.out.println("Enter customer principle amount");
		String pamt = scan.next();

		System.out.println("Enter rate of interest--");
		String rate = scan.next();

		System.out.println("Enter time period--");
		String time = scan.next();

		CustomerVo customerVo = new CustomerVo();
		customerVo.setCustomerName(customerNmae);
		customerVo.setCustomerAddress(customerAddress);
		customerVo.setPamt(pamt);
		customerVo.setRate(rate);
		customerVo.setTime(time);

		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("config/applicaitonContext.xml");
		System.out.println("***************** container started *************");
		mainController controller = factory.getBean("customerController", mainController.class);

		try {
			String result = controller.processCustomer(customerVo);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("internal problem try again " + e.getMessage());
		}

		System.out.println("************* container stopped ****************");
		scan.close();
	}

}
