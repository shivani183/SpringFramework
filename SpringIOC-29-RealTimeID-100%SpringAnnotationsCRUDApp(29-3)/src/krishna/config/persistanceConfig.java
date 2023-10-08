package krishna.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@PropertySource(value="commons/application.properties")
public class persistanceConfig {
	
	static {
		System.out.println("persistanceConfig.class is loading");
	}
	
	public persistanceConfig() {
		System.out.println("persistanceConfig:: zero arg constructor");
	}
	
	@Autowired
	private Environment env;
	
	@Bean(value="dataSource")
	public HikariDataSource getHDS() {
		System.out.println("persistanceConfig.getDS()");
		HikariDataSource source = new HikariDataSource();
		source.setDriverClassName(env.getProperty("jdbc.driverClassName"));
		source.setJdbcUrl(env.getProperty("jdbc.url"));
		source.setUsername(env.getProperty("jdbc.user"));
		source.setPassword(env.getProperty("jdbc.password"));
		source.setMinimumIdle(Integer.parseInt(env.getProperty("minimumIdle")));
		source.setMaximumPoolSize(Integer.parseInt(env.getProperty("maximumPoolSize")));
		source.setConnectionTimeout(Integer.parseInt(env.getProperty("connectionTimeout")));
		return source;
	}
	
	

}
