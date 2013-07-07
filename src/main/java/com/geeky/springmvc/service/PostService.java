package com.geeky.springmvc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geeky.springmvc.domain.PostData;
import com.geeky.springmvc.repository.PostDataRepository;

@Service
public class PostService {

	@Autowired
	private PostDataRepository dao;
	
	public List<PostData> getMessage(String userID) {
		List<PostData> list = new ArrayList<PostData>();
		list = dao.getAll(userID);
		return list;
	}

	public List<PostData> addMessage(PostData postData) {
		dao.add(postData);
		return this.getMessage(postData.getUserID());
	}
	
}
