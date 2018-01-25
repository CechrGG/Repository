package com.cechr.serverstreamproducer;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface MsgProducer {
	String OUTPUT = "output";
	String OUTPUT_STATION = "output-station";
	String OUTPUT_STATION_LINE = "output-station-line";
	
	@Output(OUTPUT)
	MessageChannel output();
	
	@Output(OUTPUT_STATION)
	MessageChannel outputStation();
	
	@Output(OUTPUT_STATION_LINE)
	MessageChannel outputStationLine();
		
}
