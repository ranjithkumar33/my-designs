package com.mydesign.business.eshop.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product extends BaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6884339238569806021L;

	@Column(name="name")
	private String name;
	
	@Column(name="code")
	private String code;
	
	@Enumerated(EnumType.STRING)
	@Column(name="status")
	private ProductStatus status;
	
	@Column(name="price")
	private double price;
	
	@OneToOne
	@JoinColumn(name="prod_info_id")
	private ProductInfo productInfo;
	
	@OneToOne
	@JoinColumn(name="prod_type_id")
	private ProductType type;

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

	public ProductStatus getStatus() {
		return status;
	}

	public void setStatus(ProductStatus status) {
		this.status = status;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public ProductInfo getProductInfo() {
		return productInfo;
	}

	public void setProductInfo(ProductInfo productInfo) {
		this.productInfo = productInfo;
	}

	public ProductType getType() {
	    return type;
	}

	public void setType(ProductType type) {
	    this.type = type;
	}
	
}
