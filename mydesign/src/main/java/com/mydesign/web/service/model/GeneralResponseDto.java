package com.mydesign.web.service.model;

import java.io.Serializable;

public class GeneralResponseDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5666445488070622567L;
	
	private String status;
	
	private String message;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
