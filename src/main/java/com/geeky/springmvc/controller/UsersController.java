package com.geeky.springmvc.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.geeky.springmvc.domain.PostData;
import com.geeky.springmvc.service.PostService;
import com.geeky.springmvc.service.UsersService;

@Controller
public class UsersController {

	@Autowired
	private UsersService usersService;
	
	@RequestMapping(value="/users",  method = RequestMethod.GET)
	public ModelAndView init() {
		List<String> resultList = usersService.getUsers();
		return new ModelAndView("users","postData", resultList);
	}
}
