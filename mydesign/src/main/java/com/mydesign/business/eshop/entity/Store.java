package com.mydesign.business.eshop.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="store")
public class Store extends BaseEntity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1279575603534382769L;

	@Column(name="name")
	private String name;
	
	@Column(name="description")
	private String description;
	
	@Column(name = "code")
	private String code;
	
	@Column(name = "opened_on")
	private Date openedOn = new Date();
	
	@Column(name = "opened_by")
	private User openedBy;
	
	@OneToMany
	@JoinColumn(name="store_id")
	private List<ProductCatalog> catalogs = new ArrayList<>();

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

	public Date getOpenedOn() {
		return openedOn;
	}

	public void setOpenedOn(Date openedOn) {
		this.openedOn = openedOn;
	}

	public User getOpenedBy() {
		return openedBy;
	}

	public void setOpenedBy(User openedBy) {
		this.openedBy = openedBy;
	}

	public List<ProductCatalog> getCatalogs() {
		return catalogs;
	}

	public void setCatalogs(List<ProductCatalog> catalogs) {
		this.catalogs = catalogs;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
			
	
}
