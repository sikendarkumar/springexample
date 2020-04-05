package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoOpenshiftApplication {

	@GetMapping("/")
	public String welcome() {
		return "Welcome to openshift";
	}
	
	@GetMapping("/{input}")
	public String congrats(@PathVariable String input) {
		return "Hi "+input+"  Your Application deployed successfully.....";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DemoOpenshiftApplication.class, args);
	}

}
