package com.geeky.springmvc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geeky.springmvc.repository.UsersRepository;

@Service
public class UsersService {

	@Autowired
	private UsersRepository dao;
	
	public void addUser(String username) {
		dao.addUser(username);
	}
	
	public List<String> getUsers() {
		List<String> list = new ArrayList<String>();
		list = dao.getAll();
		return list;
	}
	
}
