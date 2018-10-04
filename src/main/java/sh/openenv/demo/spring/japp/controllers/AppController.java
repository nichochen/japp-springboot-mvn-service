package sh.openenv.demo.spring.japp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@RequestMapping("/")
	public String greeting() {
		return "Hello, I am a Spring Boot microservice!";
	}
	
	@RequestMapping("/products")
	public String listProducts() {
		return "{}";
	}
}