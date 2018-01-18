package com.cechr.servercfgClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ServerCfgClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerCfgClientApplication.class, args);
	}
	
	@Autowired
	@Value("${context}")	
	private String context;
	@RequestMapping(value="/cfg")
	public String getCfg() {
		return context;
	}
}
