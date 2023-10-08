package krishna.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(value="{krishna}")
@Import(value=persistanceConfig.class)
public class AppConfig {

	static {
		System.out.println("AppConfig.class is loading");
	}
	
	public AppConfig() {
		System.out.println("AppConfig:: zero arg constructor");
	}
}
