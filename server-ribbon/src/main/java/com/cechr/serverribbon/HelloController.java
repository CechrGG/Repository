package com.cechr.serverribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@Autowired
	HelloService helloService;
	
	@RequestMapping(value="/hello")
	public String hello(@RequestParam String name) {
		return helloService.helloService(name);
	}
}
