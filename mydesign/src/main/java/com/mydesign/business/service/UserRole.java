package com.mydesign.business.service;

public enum UserRole {
	
	Administrator(1), VendorUser(2), OrganiserUser(3), PublicUser(4);

	private int id;
	
	UserRole(int id){
		this.id=id;
	}

	public int getId() {
		return id;
	}
	
	
}
