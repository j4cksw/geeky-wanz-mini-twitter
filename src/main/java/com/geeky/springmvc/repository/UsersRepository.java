package com.geeky.springmvc.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UsersRepository {
	@Autowired
	public RedisTemplate<String, String> redisTemplate;
	
	public RedisTemplate<String, String> getRedisTemplate() {
		return redisTemplate;
	}

	public void setRedisTemplate(RedisTemplate<String, String> redisTemplate) {
		this.redisTemplate = redisTemplate;
	}
	
	public List<String> getAll() {
		List<String> listData = new ArrayList<String>();
		for (String out: redisTemplate.opsForList().range("users-list", 0, 20)) {
			listData.add(out);
		}
		return listData;
	}
}
