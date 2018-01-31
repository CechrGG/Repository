package com.cechr.servermybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.cechr.servermybatis")
public class ServerMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerMybatisApplication.class, args);
	}
}
