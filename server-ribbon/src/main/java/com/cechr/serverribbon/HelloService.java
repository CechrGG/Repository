package com.cechr.serverribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;


@Service
public class HelloService {
	@Autowired
	RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod="helloError")
	public String helloService(String name) {
		return restTemplate.getForObject("http://SERVICE-HELLO/hello?name=" + name, String.class);
	}
	
	public String helloError(String name) {
		return "ERROR!!!" + name;
	}
}
