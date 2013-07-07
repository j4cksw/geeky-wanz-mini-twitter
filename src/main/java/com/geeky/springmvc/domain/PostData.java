package com.geeky.springmvc.domain;

import java.io.Serializable;
import java.util.Date;

public class PostData implements Serializable {

	private static final long serialVersionUID = 4173565313871347668L;

	public static final String OBJECT_KEY = "POST_DATA";
	
	private String userID;	
	private String message;
	private Date created;

	public PostData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PostData(String message) {
		super();
		this.message = message;
	}

	public PostData(String userID, String message) {
		super();
		this.userID = userID;
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

	public String getObjectKey() {
		return OBJECT_KEY;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	@Override
	public String toString() {
		return "PostData [userID=" + userID + ", message=" + message
				+ ", created=" + created + "]";
	}
	
}
