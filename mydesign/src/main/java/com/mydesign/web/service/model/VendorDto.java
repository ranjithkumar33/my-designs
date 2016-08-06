package com.mydesign.web.service.model;

import java.io.Serializable;

public class VendorDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2498641524136780918L;
	
	
	public VendorDto(String name, AddressDto address, ContactDto contact){
		this.name=name;
		this.address=address;
		this.contact=contact;
	}
	
	private String name;
	
	private String code;
	
	private AddressDto address;
	
	private ContactDto contact;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public AddressDto getAddress() {
		return address;
	}

	public void setAddress(AddressDto address) {
		this.address = address;
	}

	public ContactDto getContact() {
		return contact;
	}

	public void setContact(ContactDto contact) {
		this.contact = contact;
	}

}
