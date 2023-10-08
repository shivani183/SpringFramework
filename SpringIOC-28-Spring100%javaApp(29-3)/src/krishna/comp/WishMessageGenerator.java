package krishna.comp;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value="wish")
@Scope(scopeName="singleton")
public class WishMessageGenerator {
	
	
	static {
		System.out.println("WishMessageGenerator.class is loading");
	}
	
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator:: Zero arg constructor is loading");
	}
	
	@Autowired(required=true)
	@Qualifier(value="date1")
	private LocalDateTime date;
	
	public String wishMessage(String user) {
		int hour=date.getHour();
		
		if(hour<12)
			return "Good Morning "+user;
		if(hour>12 && hour<16)
			return "Good AfterNoon "+user;
		if(hour>20)
			return "Good Evening "+user;
		else
			return "Good Night "+user;
				
		
	}

	@Override
	public String toString() {
		return "WishMessageGenerator [date=" + date + "]";
	}
	

}
