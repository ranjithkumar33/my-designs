package com.mydesign.business.eshop.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="product_info")
public class ProductInfo extends BaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -442566741060572662L;

	@Column(name="tag")
	private String tags="";
	
	@Column(name="size")
	private String sizes = "[]";

	@Column(name="color")
	private String colors = "[]";

	@Column(name="specification")
	private String specifications = "[]";
	
	@OneToMany
	@JoinColumn(name="prod_id")
	private List<ProductImage> images = new ArrayList<>();
	
	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getSizes() {
		return sizes;
	}

	public void setSizes(String sizes) {
		this.sizes = sizes;
	}

	public String getColors() {
		return colors;
	}

	public void setColors(String colors) {
		this.colors = colors;
	}

	public String getSpecifications() {
		return specifications;
	}

	public void setSpecifications(String specifications) {
		this.specifications = specifications;
	}

	public List<ProductImage> getImages() {
		return images;
	}

	public void setImages(List<ProductImage> images) {
		this.images = images;
	}

}
