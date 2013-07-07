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

@Controller
public class PostController {
	
	@Autowired
	private PostService postService;

	@RequestMapping(value="/add", method = RequestMethod.POST)
	public ModelAndView onSubmit(@ModelAttribute("postDataForm") @Valid PostData postData, BindingResult result) {
		System.out.println(postData.getUserID());
		System.out.println(postData.getMessage());
		if (result.hasErrors()) {
			return new ModelAndView("postDataForm");
		}
		List<PostData> resultList = postService.addMessage(postData.getUserID(), postData.getMessage());
		return new ModelAndView("home","postData", resultList);
	}
	
	@RequestMapping(value="/",  method = RequestMethod.GET)
	public ModelAndView init(@ModelAttribute("postDataForm") @Valid String userID, BindingResult result) {
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		if (result.hasErrors()) {
			return new ModelAndView("home");
		}
		if (userID != null) { 
			List<PostData> resultList = postService.getMessage(userID);
			return new ModelAndView("home","postData", resultList);
		}
		return new ModelAndView("home","postData", null);
		
	}
}
