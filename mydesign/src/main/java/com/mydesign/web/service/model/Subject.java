package com.mydesign.web.service.model;

import java.io.Serializable;

/**
 * Represents a login subject which required access to the application.
 * @author Ranjith
 *
 */
public final class Subject implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2768698365534298001L;
	
	
	private String principal;
	
	private String password;

	public String getPrincipal() {
		return principal;
	}

	public void setPrincipal(String principal) {
		this.principal = principal;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

}
