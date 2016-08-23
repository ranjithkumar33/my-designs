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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="product_catalog")
public class ProductCatalog extends BaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1253759030364389426L;

	@Column(name="name")
	private String name;
	
	@Column(name="code")
	private String code;
	
	@Column(name="is_active")
	private boolean isActive;
	
	@Temporal(TemporalType.DATE)
	@Column(name="running_date_from")
	private Date runningDateFrom;

	@Temporal(TemporalType.DATE)
	@Column(name="running_date_to")
	private Date runningDateTo;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="catalog_id")
	private List<Product> products = new ArrayList<>();

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

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Date getRunningDateFrom() {
	    return runningDateFrom;
	}

	public void setRunningDateFrom(Date runningDateFrom) {
	    this.runningDateFrom = runningDateFrom;
	}

	public Date getRunningDateTo() {
	    return runningDateTo;
	}

	public void setRunningDateTo(Date runningDateTo) {
	    this.runningDateTo = runningDateTo;
	}
	
}
