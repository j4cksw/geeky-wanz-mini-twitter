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
	
	public List<PostData> addMessage(String userID, String message) {
		PostData postData = new PostData();
		postData.setUserID(userID);
		postData.setMessage(message);
		dao.add(postData);
		return this.getMessage(userID);
	}

	public List<PostData> getMessage(String userID) {
		List<PostData> list = new ArrayList<PostData>();
		list = dao.getAll();
		return list;
	}
	
}
