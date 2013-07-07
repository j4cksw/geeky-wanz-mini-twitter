package com.geeky.springmvc.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.geeky.springmvc.domain.PostData;
import com.google.gson.Gson;

@Repository
public class PostDataRepository {
	
	@Autowired
	public RedisTemplate<String, PostData> redisTemplate;

	public RedisTemplate<String, PostData> getRedisTemplate() {
		return redisTemplate;
	}

	public void setRedisTemplate(RedisTemplate<String, PostData> redisTemplate) {
		this.redisTemplate = redisTemplate;
	}
	
	public void add(PostData entry){
		Gson gson = new Gson();
		String toJson = gson.toJson(entry);
		System.out.println("add =============> "+toJson);
		System.out.println("add =============> "+entry.getMessage());
		System.out.println("add =============> "+entry.getUserID());
		redisTemplate.opsForHash().put(PostData.OBJECT_KEY, entry.getUserID(), toJson);

	}
	
	public List<PostData> getAll() {
		List<PostData> listData = new ArrayList<PostData>();
		for (Object postData: redisTemplate.opsForHash().values(PostData.OBJECT_KEY)) {
			Gson gson = new Gson();
			System.out.println("get All =============> "+(String)postData);
			PostData out = gson.fromJson((String)postData, PostData.class);
			listData.add(out);
		}
		return listData;
	}
	
}
