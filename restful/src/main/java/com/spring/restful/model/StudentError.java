package com.spring.restful.model;

public class StudentError {

	private int statuscode;
	private long timestap;
	private String message;

	public StudentError() {
		super();
	}

	public int getStatuscode() {
		return statuscode;
	}

	public void setStatuscode(int statuscode) {
		this.statuscode = statuscode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public long getTimestap() {
		return timestap;
	}

	public void setTimestap(long timestap) {
		this.timestap = timestap;
	}
	
}
