package com.mydesign.business.persistence;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.mydesign.business.service.UserRole;

@Entity
@NamedQueries(value={
		@NamedQuery(name="User.findUserByEmail", query="from UserAccount u where u.contact.email=:email"),
		@NamedQuery(name="User.findUserByMobile", query="from UserAccount u where u.contact.mobile=:mobile")
		})
@Table(name="useraccount")
public class UserAccount extends BaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7444263478302677372L;
	

	
	@Column
	private String name;
	
	@Column
	private String password;
	
	@Enumerated(EnumType.STRING)
	private UserRole role;
	
	@OneToOne(cascade=CascadeType.ALL)
	private ContactInfo contact;

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ContactInfo getContact() {
		return contact;
	}

	public void setContact(ContactInfo contact) {
		this.contact = contact;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserRole getRole() {
		return role;
	}

	public void setRole(UserRole role) {
		this.role = role;
	}
}
