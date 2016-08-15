package com.mydesign.business.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.mydesign.business.service.constant.EImageType;

@Entity
@Table(name="product_image")
public class ProductImage extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3079156505936709061L;

	@Enumerated(EnumType.STRING)
	@Column
	private EImageType type;
	
	@Column
	private String title;
	
	@Column
	private String name;
	
	@Column
	private String url;

	public EImageType getType() {
		return type;
	}

	public void setType(EImageType type) {
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
