package com.cechr.serverredis;

import java.lang.reflect.Method;
//import java.util.HashMap;
//import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.cache.CacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
//import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
//
//import com.fasterxml.jackson.annotation.JsonAutoDetect;
//import com.fasterxml.jackson.annotation.PropertyAccessor;
//import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
@EnableCaching
public class RedisConfig extends CachingConfigurerSupport {
	
	@Autowired
	private RedisConn redisConn;
	
	//生产Key的策略
	@Bean
	@Override
	public KeyGenerator keyGenerator() {
		return new KeyGenerator() {
			@Override
			public Object generate(Object target, Method method, Object... params) {
				StringBuilder sb = new StringBuilder();
				sb.append(target.getClass().getName());
				sb.append(method.getName());
				for(Object obj : params) {
					sb.append(obj.toString());
				}
				return sb.toString();
			}
		};
	}
	
	//管理缓存
	@SuppressWarnings("rawtypes")
	@Bean
	public CacheManager CacheManager(RedisTemplate redisTemplate) {
		RedisCacheManager redisCM = new RedisCacheManager(redisTemplate);
//		redisCM.setDefaultExpiration(60);
//		Map<String, Long> map = new HashMap<String, Long>();
//		map.put("test", 60L);
//		redisCM.setExpires(map);
		return redisCM;
	}
	
	//redis connection pool
	@Bean
	public JedisConnectionFactory redisConnectionFactory() {
		JedisConnectionFactory factory = new JedisConnectionFactory();
		factory.setHostName(redisConn.getHost());
		factory.setPort(redisConn.getPort());
		factory.setTimeout(redisConn.getTimeout());
		return factory;
	}
	
	//redisTemplate config
	@SuppressWarnings({ })
	@Bean
	public RedisTemplate<String, String> redisTemplate(RedisConnectionFactory factory) {
		StringRedisTemplate template = new StringRedisTemplate(factory);
//		Jackson2JsonRedisSerializer j2JRS = new Jackson2JsonRedisSerializer(Object.class);
//		ObjectMapper objMapper = new ObjectMapper();
//		objMapper.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
//		j2JRS.setObjectMapper(objMapper);
//		template.setValueSerializer(j2JRS);
//		template.afterPropertiesSet();
		return template;
	}
}
