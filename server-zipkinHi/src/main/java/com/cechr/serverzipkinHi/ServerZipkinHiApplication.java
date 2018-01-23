package com.cechr.serverzipkinHi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class ServerZipkinHiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerZipkinHiApplication.class, args);
	}
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
	@RequestMapping("/info")
	public String info() {
		return "Hi, I'm server-zipkinHi";
	}
	
	@RequestMapping("/hi")
	public String hi() {
		return restTemplate.getForObject("http://localhost:8021/info", String.class);
	}
	
}
