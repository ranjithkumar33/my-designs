package com.mydesign.business.eshop.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name="vendor")
public class Vendor extends BaseEntity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5481207252081820870L;
	
	@Column(name="name")
	private String name;
	
	@Column(name="code")
	private String code;
	
	@Enumerated(EnumType.STRING)
	@Column(name="type")
	private VendorType type;

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

	public VendorType getType() {
		return type;
	}

	public void setType(VendorType type) {
		this.type = type;
	}
	
	

}
