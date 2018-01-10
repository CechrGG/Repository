package com.cechr.test.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cechr.test.properties.AppProperties;
import com.cechr.test.properties.GlobalProperties;

@Controller
public class WelcomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(WelcomeController.class);
	
	private AppProperties app;
	private GlobalProperties global;
	
	@Autowired
	public void setApp(AppProperties app) {
		this.app = app;
	}
	
	@Autowired
	public void setGlobal(GlobalProperties global) {
		this.global = global;
	}
	
	@Value("${welcome.message:hello}")
	private String message = "hello world";
	
	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		
		String appProperties = app.toString();
		String globalProperties = global.toString();
		
		logger.info("Welcome {}, {}", app, global);
		
		model.put("message", appProperties  + globalProperties);
		return "welcome";
	}
}
