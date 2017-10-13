package com.example.demoproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.*")
public class DemoProjectApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(DemoProjectApplication.class, args);
		//TEST3
	}
}
