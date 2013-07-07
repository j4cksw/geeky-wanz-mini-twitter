package com.geeky.springmvc.domain;

public class PostData {
	
	private String userID;	
	private String message;

	public PostData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PostData(String message) {
		super();
		this.message = message;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
