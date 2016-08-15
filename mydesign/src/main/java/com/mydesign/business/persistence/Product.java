package com.mydesign.business.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8006681583152958083L;
	
	@Column
	private String name;
	
	@Column
	private String code;
	
	@ManyToOne
	@JoinColumn(name="cat_id")
	private ProductCategory category;
	
	@Column
	private String descriptions = "";
	
	@Column
	private String tags="";
	
	@ManyToOne
	@JoinColumn(name="vendor_id")
	private Vendor vendor;
	
	@OneToOne
	@JoinColumn(name="spec_id")
	private ProductSpecification specification;

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

	public ProductCategory getCategory() {
		return category;
	}

	public void setCategory(ProductCategory category) {
		this.category = category;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public Vendor getVendor() {
		return vendor;
	}

	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}

	public String getDescriptions() {
		return descriptions;
	}

	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
	}

	public ProductSpecification getSpecification() {
		return specification;
	}

	public void setSpecification(ProductSpecification specification) {
		this.specification = specification;
	}
	
}
