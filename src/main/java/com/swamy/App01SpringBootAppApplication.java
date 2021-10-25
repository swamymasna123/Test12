package com.swamy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App01SpringBootAppApplication {

	public static void main(String[] args) {
		
//		Added Some Logic inside the Starter class
		ConfigurableApplicationContext context = null;
		context = SpringApplication.run(App01SpringBootAppApplication.class, args);
		System.out.println("From Starter class...!");
		context.close();
	}

}
