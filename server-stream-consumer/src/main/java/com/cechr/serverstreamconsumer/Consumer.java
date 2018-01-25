package com.cechr.serverstreamconsumer;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@EnableBinding(value = {MsgConsumer.class})
@Component
public class Consumer {
	
	@StreamListener(MsgConsumer.INPUT)
	public void received(Object msg) {
		System.out.println("All Received message:" + msg);
	}
	
	@StreamListener(MsgConsumer.INPUT_STATION)
	public void receivedStation(Object msg) {
		System.out.println("Station Received message:" + msg);
	}
	
	@StreamListener(MsgConsumer.INPUT_STATION_LINE)
	public void receivedLine(Object msg) {
		System.out.println("Line Received message:" + msg);
	}
}
