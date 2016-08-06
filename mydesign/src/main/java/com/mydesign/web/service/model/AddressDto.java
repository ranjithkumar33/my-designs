package com.mydesign.web.service.model;

import java.io.Serializable;

public class AddressDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8612503749543052376L;
	
	public AddressDto(String address1, String address2, String locality, String city, String state, String pin){
		this.address1=address1;
		this.address2=address2;
		this.locality=locality;
		this.city=city;
		this.state=state;
		this.pin=pin;
	}
	
	public AddressDto(){
	}
	
	private String address1;
	
	private String address2;
	
	private String locality;
	
	private String city;
	
	private String state;
	
	private String pin;

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}
	

}
