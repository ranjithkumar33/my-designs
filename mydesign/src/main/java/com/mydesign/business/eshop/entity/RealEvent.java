package com.mydesign.business.eshop.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@DiscriminatorValue("REAL")
public class RealEvent extends Event{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5594547658557582064L;
	
	@OneToOne
	@JoinColumn(name="addr_id")
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
}
