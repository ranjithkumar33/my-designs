package com.mydesign.business.service;

public enum UserRole {
	
	Administrator(1), VendorUser(2), PublicUser(3);

	private int id;
	
	UserRole(int id){
		this.id=id;
	}
	
	
}
