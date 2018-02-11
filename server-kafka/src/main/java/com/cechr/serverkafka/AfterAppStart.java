package com.cechr.serverkafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AfterAppStart implements ApplicationListener<ApplicationReadyEvent> {
	
	@Autowired
	private MsgProducer msgProducer;
	
	@Override
	public void onApplicationEvent(ApplicationReadyEvent appReadyEvent) {
		msgProducer.send();
	}
}
