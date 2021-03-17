package com.dialogflow.dialogflowforbrowser.modelsforapi;

public class Status {

	private int code;
	private String message;
	private Object[] details;
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object[] getDetails() {
		return details;
	}
	public void setDetails(Object[] details) {
		this.details = details;
	}
}
