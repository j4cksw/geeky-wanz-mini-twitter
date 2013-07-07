package com.geeky.springmvc.repository;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import com.geeky.springmvc.domain.PostData;

public class SavePostDataTest {

	@Before
	public void setUp() throws Exception {
		
				
	}

	@Test
	public void test() {
		
		JedisConnectionFactory connectionFactory = new JedisConnectionFactory();
		connectionFactory.setHostName("localhost");
		
		RedisTemplate<String, PostData> template = new RedisTemplate<String, PostData>();
		template.setConnectionFactory(connectionFactory);
		
		PostDataRepository repo = new PostDataRepository();
		
		repo.setRedisTemplate(template);
		
		PostData test_data = new PostData("user1", "test_message");
		
		repo.push(test_data);
		
	}

}
