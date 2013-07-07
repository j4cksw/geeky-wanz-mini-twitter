package com.geeky.springmvc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.geeky.springmvc.domain.PostData;

@Service
public class PostService {

	public List<PostData> addMessage(String user, String message) {
		List<PostData> list = new ArrayList<PostData>();
		return list;
	}
	
}
