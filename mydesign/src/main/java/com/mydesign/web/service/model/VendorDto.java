package com.mydesign.web.service.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class VendorDto extends BusinessEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2498641524136780918L;
	
	
	public VendorDto(String name, AddressDto address, ContactDto contact){
		super(name, address, contact);
	}
	
	private EVendorType type;
	
	private List<EProductType> productTypes = new ArrayList<>();


	public EVendorType getType() {
		return type;
	}

	public void setType(EVendorType type) {
		this.type = type;
	}

	public List<EProductType> getProductTypes() {
		return productTypes;
	}

	public void setProductTypes(List<EProductType> productTypes) {
		this.productTypes = productTypes;
	}
	
}
