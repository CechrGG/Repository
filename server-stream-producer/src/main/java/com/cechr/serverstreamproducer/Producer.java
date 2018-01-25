package com.cechr.serverstreamproducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableBinding(value = {MsgProducer.class})
@Component
@RestController
@RequestMapping("/send")
public class Producer {
	
	@Autowired
	private MsgProducer msgProducer;
	
	@RequestMapping("/all")
	public void sendAll() {
		msgProducer.output().send(MessageBuilder.withPayload("I'm a Center message").build());
	}
	
	@RequestMapping("/station")
	public void sendStation() {
		msgProducer.outputStation().send(MessageBuilder.withPayload("I'm a station message").build());
	}
	
	@RequestMapping("/line")
	public void sendLine() {
		msgProducer.outputStationLine().send(MessageBuilder.withPayload("I'm a line message").build());
	}
}
