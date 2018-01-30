package com.cechr.serverredis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/redis")
public class ServerRedisApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerRedisApplication.class, args);
	}
	
	@Autowired 
	private RedisUtil redisUtil;
	
	@RequestMapping("/get")
	public String get(@RequestParam(value = "key") String key) {
		if(redisUtil.exists(key)) {
			return "Redis exist " + key + ":" + redisUtil.get(key);
		} else {
			return "Redis don/t know " + key;
		}
	}
	
	@RequestMapping("/set")
	public String set(@RequestParam(value = "key") String key, @RequestParam(value = "value") String value) {
		if (redisUtil.set(key, value)) {
			return "Redis set key-value success";
		} else {
			return "Redis set key-value failed";
		}
	}
}
