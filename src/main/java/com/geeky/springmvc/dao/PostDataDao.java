package com.geeky.springmvc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.geeky.springmvc.domain.PostData;

@Repository
public class PostDataDao implements PostDataRepository {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Override
    public void addData(String key, PostData postData) {
    	System.out.println("====================> "+key);
    	System.out.println("====================> "+postData.toString());
       // redisTemplate.opsForList().((key, postData);
    }

	@Override
	public List<PostData> listData(String key) {
    	System.out.println("list ====================> "+key);
		return null;
	}

}
