package com.cechr.serverfeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@Autowired
	private ServiceHello serviceHello;
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String sayHello(@RequestParam String name) {
		return serviceHello.sayHello(name);
	}
}
