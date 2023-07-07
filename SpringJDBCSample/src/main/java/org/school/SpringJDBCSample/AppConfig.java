package org.school.SpringJDBCSample;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("org.school.SpringJDBCSample")
@PropertySource("classpath:database.properties")
public class AppConfig {
	@Autowired
	Environment enviroment;
	private final String URL = "url";
	private final String USER = "dbuser";
	private final String DRIVER = "driver";
	private final String PASSWORD = "dbpassword";
	
	@Bean
	DataSource dataSource(){
		DriverManagerDataSource drivermanagerDatasource = new DriverManagerDataSource();
		drivermanagerDatasource.setUrl(enviroment.getProperty(URL));
		drivermanagerDatasource.setUsername(enviroment.getProperty(USER));
		drivermanagerDatasource.setPassword(enviroment.getProperty(PASSWORD));
		drivermanagerDatasource.setDriverClassName(enviroment.getProperty(DRIVER));
		return drivermanagerDatasource;
	}
}