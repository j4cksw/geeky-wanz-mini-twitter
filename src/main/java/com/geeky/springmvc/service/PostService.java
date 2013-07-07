package com.geeky.springmvc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geeky.springmvc.dao.PostDataDao;
import com.geeky.springmvc.domain.PostData;

@Service
public class PostService {

	@Autowired
	private PostDataDao dao;
	
	public List<PostData> addMessage(String userID, String message) {
		PostData postData = new PostData();
		postData.setUserID(userID);
		postData.setMessage(message);
		dao.addData(userID, postData);
		return this.getMessage(userID);
	}

	public List<PostData> getMessage(String userID) {
		List<PostData> list = new ArrayList<PostData>();
		list = dao.listData(userID);
		return list;
	}
	
}
