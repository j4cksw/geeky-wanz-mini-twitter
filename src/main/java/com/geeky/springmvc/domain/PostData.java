package com.geeky.springmvc.domain;

public class PostData {
	
	private String userID;	
	private String message;

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
