package com.example.springbootgetapidemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootGetApiDemoApplication {
	
	@GetMapping("/hello")
	public String message(){
		return "Welcome to EnggAdda";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootGetApiDemoApplication.class, args);
	}

}
