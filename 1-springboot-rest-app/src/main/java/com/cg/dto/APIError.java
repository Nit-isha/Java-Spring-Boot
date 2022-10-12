package com.cg.dto;

public class APIError {
	private String msg;
	private int status;
	
	public APIError() {
		// TODO Auto-generated constructor stub
	}
	
	public APIError(String msg, int status) {
		super();
		this.msg = msg;
		this.status = status;
	}
	
	public String getMsg() {
		return msg;
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public int getStatus() {
		return status;
	}
	
	public void setStatus(int status) {
		this.status = status;
	}


}