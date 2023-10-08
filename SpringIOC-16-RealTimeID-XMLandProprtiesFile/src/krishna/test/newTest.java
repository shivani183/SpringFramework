package krishna.test;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import krishna.controller.MainController;
import krishna.vo.ResultVO;

public class newTest {

	public static void main(String[] args) throws Exception {

		// Reading the inputs
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the Student Name :: ");
		String studentName = scanner.next();

		System.out.print("Enter the Student Address :: ");
		String studentAddress = scanner.next();

		System.out.print("Enter the Biology Marks :: ");
		String bioMarks = scanner.next();

		System.out.print("Enter the Physics Marks :: ");
		String physicsMarks = scanner.next();

		System.out.print("Enter the Maths Marks :: ");
		String mathsMarks = scanner.next();
		
		System.out.print("Enter the Maximum Marks :: ");
		String maximumMarks = scanner.next();

		ResultVO vo = new ResultVO();
		vo.setStudentName(studentName);
		vo.setStudentAddress(studentAddress);
		vo.setBioMarks(bioMarks);
		vo.setMathsMarks(mathsMarks);
		vo.setPhysicsMarks(physicsMarks);
		vo.setMaximumMarks(maximumMarks);


		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("config/applicaitonContext.xml");

		System.out.println("************Container Started***************");

		MainController controller = factory.getBean("resultController", MainController.class);
		try {
			String result = controller.processResult(vo);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("Internal problem.. Try again....." + e.getMessage());
		}
		factory.close();
		System.out.println("\n************Container Stopped***************");
		scanner.close();
	}
}
