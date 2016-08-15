package com.mydesign.business.persistence;

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
public class ProductInfo extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4054403128484046035L;

	@Column
	private String tags="";
	
	@OneToOne
	@JoinColumn(name="spec_id")
	private ProductSpecification specification;
	
	@OneToMany
	@JoinColumn(name="prod_id")
	private List<ProductImage> images = new ArrayList<>();

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public ProductSpecification getSpecification() {
		return specification;
	}

	public void setSpecification(ProductSpecification specification) {
		this.specification = specification;
	}

	public List<ProductImage> getImages() {
		return images;
	}

	public void setImages(List<ProductImage> images) {
		this.images = images;
	}
	
}
