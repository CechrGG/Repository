package com.cechr.serverfeign;

import org.springframework.stereotype.Component;

@Component
public class ServiceHelloImpl implements ServiceHello {

	@Override
	public String sayHello(String name) {
		// TODO Auto-generated method stub
		return "Error!!!" + name;
	}

}
