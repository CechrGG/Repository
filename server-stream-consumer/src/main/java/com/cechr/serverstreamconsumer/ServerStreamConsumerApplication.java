package com.cechr.serverstreamconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
//import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@SpringBootApplication
//@EnableBinding(value = {Sink.class})
public class ServerStreamConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerStreamConsumerApplication.class, args);
	}
	
//	@StreamListener(Sink.INPUT)
//	public void sinkMessage(Object message) {
//		System.out.println("Received message: " + message);
//	}
}
