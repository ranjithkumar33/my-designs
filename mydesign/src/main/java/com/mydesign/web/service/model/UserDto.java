package com.mydesign.web.service.model;

import java.io.Serializable;

public class UserDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8450822135330508637L;
	
	public UserDto(){}
	
	public UserDto(String contact){
		
	}
	
	private ContactDto contact;
	
	

	public ContactDto getContact() {
		return contact;
	}

	public void setContact(ContactDto contact) {
		this.contact = contact;
	}


}
