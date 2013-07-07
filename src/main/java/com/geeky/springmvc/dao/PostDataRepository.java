package com.geeky.springmvc.dao;

import java.util.List;

import com.geeky.springmvc.domain.PostData;

public interface PostDataRepository {
	public void addData(String key, PostData value);
	public  List<PostData> listData(String key);
}
