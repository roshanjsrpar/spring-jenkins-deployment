package com.example.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringJenkinsDeploymentApplication {
	
	@GetMapping("wish")
	public String wishMessage() {
		return "Welcome to first web page";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringJenkinsDeploymentApplication.class, args);
	}

}
