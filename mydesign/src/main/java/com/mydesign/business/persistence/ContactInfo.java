package com.mydesign.business.persistence;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="contactinfo")
public class ContactInfo extends BaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5156083749455162017L;

	
	@Column
    private String telephone;
	
	@Column
	private String mobile;
	
	@Column
	private String email;

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
