package com.cechr.springCloudTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringCloudTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudTestApplication.class, args);
	}
}
