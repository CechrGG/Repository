package com.cechr.servermybatis;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeviceController {
	
	@Resource
	private DeviceService devService;
	
	@RequestMapping("/getDevices")
	public List<Device> getDevicesByName(@RequestParam(value = "name") String name) {
		return devService.getDevicesByName(name);
	}
}
