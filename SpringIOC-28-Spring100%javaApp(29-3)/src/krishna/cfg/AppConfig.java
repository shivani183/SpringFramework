package krishna.cfg;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages= {"krishna"})
public class AppConfig {
	
	static {
		System.out.println("AppConfig.class is loading");
	}
	 
	public AppConfig() {
		System.out.println("AppConfig:: zero arg constructor");
	}
	
	
	@Bean(value="date1")
	public LocalDateTime createDate1() {
		System.out.println("AppConfig.createDate()");
		return LocalDateTime.now();	
	}
	@Bean(value="date2")
	public LocalDateTime createDate2() {
		System.out.println("AppConfig.createDate()");
		return LocalDateTime.now();	
	}


	

}
