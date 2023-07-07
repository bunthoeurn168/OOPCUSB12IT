package com.example.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootdemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringbootdemoApplication.class, args);
		//System.out.println("Hello World");
		Employee emp = context.getBean(Employee.class);
		emp.setId(1);
		emp.setName("Sok San");
		emp.display();
	}

}
