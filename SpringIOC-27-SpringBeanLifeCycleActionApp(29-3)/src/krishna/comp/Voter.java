package krishna.comp;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component(value = "voter")
@PropertySource(value = "commons/app.properties")
public class Voter {

	@Value("${voter.info.name}")
	private String name;

	@Value("${voter.info.age}")
	private int age;
	private Date dov;

	static {
		System.out.println("\nvoter.class file is loading..");
	}

	public Voter() {
		System.out.println("Voter class Instantiated...");
	}

	@PostConstruct
	public void myInit() {
		System.out.println("Voter.inIt()");
		dov = new Date();
		boolean flag = false;

		if (name == null) {
			System.out.println("name should not be null");
			flag = true;
		}
		if (age < 0)
			age *= -1;
		if (age > 100) {
			System.out.println("Age must not be greater than 100");
			flag = true;
		}
		if (flag)
			throw new IllegalArgumentException("Invalid inputs..");
	}

	public String checkVotingEligibility() {
		System.out.println("Voter.checkVotingEligibility()");

		if (age >= 18)
			return "Mr/Miss/Mrs :: " + name + " you are eligible for voting " + age;
		else
			return "Mr/Miss/Mrs :: " + name + " you are not eligible for voting " + age;
	}

	@PreDestroy
	public void myDestroy() {
		System.out.println("Voter.myDestroy()");
		name = null;
		age = 0;
		dov = null;
	}

	@Override
	public String toString() {
		return "Voter [name=" + name + ", age=" + age + ", dov=" + dov + "]";
	}

}
