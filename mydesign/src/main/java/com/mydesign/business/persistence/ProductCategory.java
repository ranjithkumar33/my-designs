package com.mydesign.business.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="product_category")
public class ProductCategory extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7858346178125146664L;

	@Column
	private String name;
	
	@Column
	private String code;

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
	
	
}
