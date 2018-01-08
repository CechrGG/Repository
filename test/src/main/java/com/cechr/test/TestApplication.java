package com.cechr.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@Controller
@RequestMapping("/test")
public class TestApplication {

	@RequestMapping("/hello")
	public String sayHello() {
		return "hello";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}
}
