package com.mydesign.web.service.model;

import java.io.Serializable;

public class ContactDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6559593537999951321L;
	
	public ContactDto(String telephone, String mobile, String email){
		this.telephone=telephone;
		this.mobile=mobile;
		this.email=email;
	}
	
	public ContactDto(){
	
	}
	
	
	private String name;
	
	private String telephone;
	
	private String mobile;
	
	private String email;

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
