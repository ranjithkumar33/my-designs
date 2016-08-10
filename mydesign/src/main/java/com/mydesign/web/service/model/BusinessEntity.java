package com.mydesign.web.service.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class BusinessEntity implements IBusinessEntity, Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6444910281274314544L;
	
	public BusinessEntity(String name, AddressDto address, ContactDto contact){
		this.name=name;
		this.address=address;
		this.contact=contact;
	}

	private String name;
	
	private String code;
	
	private AddressDto address;
	
	private ContactDto contact;

	private List<IPerson> staffs = new ArrayList<>();

	public List<IPerson> getStaffs() {
		return staffs;
	}

	public void setStaffs(List<IPerson> staffs) {
		this.staffs = staffs;
	}
	
	public void addStaff(IPerson staff) {
		this.staffs.add(staff);
	}
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
