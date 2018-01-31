package com.cechr.servermybatis;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface DeviceMapper {
	
	@Select("select * from t_device where name=#{name}")
	public List<Device> getDevicesByName(String name);
	
	@Insert("insert into t_device(name, category) values(#{name}, #{category})")
	public void save(Device device);
}
