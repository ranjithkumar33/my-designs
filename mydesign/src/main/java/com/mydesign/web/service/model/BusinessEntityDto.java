package com.mydesign.web.service.model;

import java.io.Serializable;

public class BusinessEntityDto implements IBusinessEntity, Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6444910281274314544L;
	
	public BusinessEntityDto(String name, AddressDto address, ContactDto contact){
		this.name=name;
		this.address=address;
		this.contact=contact;
	}
	
	public BusinessEntityDto(){
	}

	private String name;
	
	private String code;
	
	private AddressDto address;
	
	private ContactDto contact;

	private EBusinessEntityType entityType;

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

	public EBusinessEntityType getEntityType() {
		return entityType;
	}

	public void setEntityType(EBusinessEntityType entityType) {
		this.entityType = entityType;
	}

}
