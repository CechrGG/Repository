package com.cechr.serverkafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MsgConsumer {
	@KafkaListener(topics = {"testTopic"})
	public void processMsg(String content) {
		System.out.println(content);
	}
}
