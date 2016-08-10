package com.mydesign.web.service.model;

import java.io.Serializable;

public class UserDto implements IPerson, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8450822135330508637L;
	
	public UserDto(){}
	
	public UserDto(String contact){
		
	}
	
	private long id;
	
	
	private String name;
	
	private ContactDto contact;
	
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public ContactDto getContact() {
		return contact;
	}

	public void setContact(ContactDto contact) {
		this.contact = contact;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
