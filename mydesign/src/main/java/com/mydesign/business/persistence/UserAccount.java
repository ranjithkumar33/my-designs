package com.mydesign.business.persistence;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

@Entity
@NamedQueries(value={
		@NamedQuery(name="User.findUserByEmail", query="from UserAccount u where u.contact.email=:email"),
		@NamedQuery(name="User.findUserByMobile", query="from UserAccount u where u.contact.mobile=:mobile")
		})
public class UserAccount implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7444263478302677372L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column
	private String name;
	
	@Column
	private String password;
	
	@OneToOne(cascade=CascadeType.ALL)
	private ContactInfo contact;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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
}
