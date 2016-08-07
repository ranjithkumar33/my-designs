package com.mydesign.web.service.model;

import java.io.Serializable;

public class SignupShortDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4173084403050185199L;
	
	private String name;
	
	private String emailOrMobile;
	
	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailOrMobile() {
		return emailOrMobile;
	}

	public void setEmailOrMobile(String emailOrMobile) {
		this.emailOrMobile = emailOrMobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "["+this.name+", "+this.emailOrMobile+"]";
	}
	
}
