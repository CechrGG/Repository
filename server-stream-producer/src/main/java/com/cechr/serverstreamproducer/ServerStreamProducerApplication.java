package com.cechr.serverstreamproducer;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@EnableBinding(value = {Source.class})
//@RestController
public class ServerStreamProducerApplication {

	public static void main(String[] args) {
		/*ConfigurableApplicationContext context =*/ SpringApplication.run(ServerStreamProducerApplication.class, args);		
//		System.out.println("Subscribe result: " + subscribe(context));
//		System.out.println("Publish message: " + publish(context));
	}
	
//	@Autowired
//	private static MsgService msgService;
	
//	@Value("${message}")
//	private String msg;
	
//	public static boolean publish(ConfigurableApplicationContext context) {
//		MsgService service = context.getBean(MsgService.class);
//		return service.publish("I'm coming!");
//	}
//	
//	public static boolean subscribe(ConfigurableApplicationContext context) {
//		MsgService service = context.getBean(MsgService.class);
//		return service.subscribe(result -> {
//			System.out.println("Received Message:" + result.getPayload());
//		});
//	}
	
//	@InboundChannelAdapter(value = Source.OUTPUT)
//	public String timerMessageSource() {
////		String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
////		return format;
//		return "Hello";
//	}
	
//	@Autowired
//	private Source source;
//	
//	@RequestMapping("/hello")
//	public void send() {
//		source.output().send(MessageBuilder.withPayload("Hello GuoGuo").build());
//	}
}
