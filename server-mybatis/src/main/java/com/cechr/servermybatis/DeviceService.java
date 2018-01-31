package com.cechr.servermybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeviceService {
	
	@Autowired
	private DeviceMapper devMapper;
	
	public List<Device> getDevicesByName(String name) {
		return devMapper.getDevicesByName(name);
	}
}
