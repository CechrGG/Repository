package com.cechr.test.properties;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component
@PropertySource("classpath:config/global.properties")
@ConfigurationProperties 
@Validated
public class GlobalProperties {
	
	@Max(20)
	@Min(0)
	private int threadPool;
	
	@NotEmpty
	private String email;
	
	public int getThreadPool() {
		return threadPool;
	}
	public void setThreadPool(int threadPool) {
		this.threadPool = threadPool;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "GlobalProperties{threadPool=" + threadPool + ", email='" + email + "'}";
	}
}
