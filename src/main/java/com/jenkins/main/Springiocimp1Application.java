package com.jenkins.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Springiocimp1Application {
	
	@GetMapping("/message")
	public String getMessage() {
		System.out.println("Hello world from Java Spring");
		return "Hello Jenkins, Here from Java";
	}
	public static void main(String[] args) {
		SpringApplication.run(Springiocimp1Application.class, args);
	}

}
