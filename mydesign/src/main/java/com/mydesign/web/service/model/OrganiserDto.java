package com.mydesign.web.service.model;

import java.io.Serializable;

public class OrganiserDto extends BusinessEntity implements Serializable{

	public OrganiserDto(String name, AddressDto address, ContactDto contact) {
		super(name, address, contact);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -2589327310154497778L;
	

}
