package com.cechr.serverstreamconsumer;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface MsgConsumer {
	String INPUT = "input";
	String INPUT_STATION = "input-station";
	String INPUT_STATION_LINE = "input-station-line";
	
	@Input(INPUT)
	SubscribableChannel input();
	
	@Input(INPUT_STATION)
	SubscribableChannel inputStation();
	
	@Input(INPUT_STATION_LINE)
	SubscribableChannel inputStationLine();
}
