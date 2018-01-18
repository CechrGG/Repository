package com.cechr.servercfgCenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ServerCfgCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerCfgCenterApplication.class, args);
	}
}
