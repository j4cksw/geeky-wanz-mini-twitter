package com.geeky.springmvc.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

import com.geeky.springmvc.domain.Post;

public class PostRepository implements Repository<Post> {

	@Autowired
	private RedisTemplate<String, Post> redisTemplate;

	public RedisTemplate<String, Post> getTemplate() {
		return redisTemplate;
	}

	public void setTemplate(RedisTemplate<String, Post> template) {
		this.redisTemplate = template;
	}

	@Override
	public void put(Post entry) {
		redisTemplate.opsForHash().put(entry.getObjectKey(), entry.getKey(),
				entry);
	}

	@Override
	public Post get(Post key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Post key) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Post> getObjects() {
		List<Post> posts = new ArrayList<Post>();
		for (Object post : redisTemplate.opsForHash().values(Post.OBJECT_KEY)) {
			posts.add((Post) post);
		}
		return posts;
	}

}
