package com.mydesign.business.eshop.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@DiscriminatorValue("VENDOR")
public class VendorUser extends User{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5693553665934787128L;
	
	@OneToOne
	@JoinColumn(name="vendor_id")
	private Vendor vendor;

	public Vendor getVendor() {
		return vendor;
	}

	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}
	
}
