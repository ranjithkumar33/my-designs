package com.mydesign.business.persistence;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.mydesign.business.service.constant.ECatalogStatus;

@Entity
@Table(name="product_catalog")
public class ProductCatalog extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = -210395364068738949L;
	
	@Column
	private String name;
	
	@Column
	private String description;
	
	@Enumerated(EnumType.STRING)
	@Column
	private ECatalogStatus status;
	
	@OneToMany
	@JoinColumn(name="catalog_id")
	private List<Product> products = new ArrayList<>();
	
	@OneToOne
	private Vendor vendor;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ECatalogStatus getStatus() {
		return status;
	}

	public void setStatus(ECatalogStatus status) {
		this.status = status;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Vendor getVendor() {
		return vendor;
	}

	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}
	

}
