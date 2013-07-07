package com.geeky.springmvc.domain;

import java.io.Serializable;
import java.util.Date;

public class PostData implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4255079607108918154L;

	public static final String OBJECT_KEY = "POST_DATA";
	
	private String userID;	
	private String message;
	private Date date = new Date();

	public PostData(String userId, String message) {
		super();
		this.userID = userId;
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
}
