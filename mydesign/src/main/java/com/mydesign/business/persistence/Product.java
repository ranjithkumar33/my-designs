package com.mydesign.business.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.mydesign.business.service.constant.EProductStatus;

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
	
	@Column
	private float price;
	
	@ManyToOne
	@JoinColumn(name="category_id")
	private ProductCategory category;
	
	@Enumerated(EnumType.STRING)
	@Column
	private EProductStatus status;
	
	@Column
	private String description = "";
	
	@OneToOne
	@JoinColumn(name="prod_info_id")
	private ProductInfo productInfo;
	

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

	
	public String getDescription() {
		return description;
	}

	public void setDescription(String descriptions) {
		this.description = descriptions;
	}

	public ProductInfo getProductInfo() {
		return productInfo;
	}

	public void setProductInfo(ProductInfo productInfo) {
		this.productInfo = productInfo;
	}

	
	
}
