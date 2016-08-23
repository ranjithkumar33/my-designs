package com.mydesign.business.eshop.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name="product_image")
public class ProductImage extends BaseEntity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7354446797546072552L;

	@Enumerated(EnumType.STRING)
	@Column(name="type")
	private ImageType type;
	
	@Column(name="title")
	private String title;
	
	@Column(name="name")
	private String name;
	
	@Column(name="url")
	private String url;

	public ImageType getType() {
		return type;
	}

	public void setType(ImageType type) {
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
