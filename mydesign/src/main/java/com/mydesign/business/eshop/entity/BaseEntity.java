package com.mydesign.business.eshop.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.databind.ObjectMapper;

@MappedSuperclass
public class BaseEntity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3813976042370409531L;


	protected transient ObjectMapper mapper = new ObjectMapper();
	
	
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	private String id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_on")
	private Date createdOn = new Date();
 
	@Column(name = "created_by")
	private User createdBy;
	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public Date getCreatedOn() {
		return createdOn;
	}


	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}


	public User getCreatedBy() {
		return createdBy;
	}


	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}



}
