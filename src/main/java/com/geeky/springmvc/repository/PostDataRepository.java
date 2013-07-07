package com.geeky.springmvc.repository;

import javax.crypto.spec.PSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

import com.geeky.springmvc.domain.PostData;

public class PostDataRepository {
	
	@Autowired
	public RedisTemplate<String, PostData> redisTemplate;

	public RedisTemplate<String, PostData> getRedisTemplate() {
		return redisTemplate;
	}

	public void setRedisTemplate(RedisTemplate<String, PostData> redisTemplate) {
		this.redisTemplate = redisTemplate;
	}
	
	public void push(PostData entry){
		redisTemplate.opsForHash().put(PostData.OBJECT_KEY, entry.getUserID(), entry);
	}
}
