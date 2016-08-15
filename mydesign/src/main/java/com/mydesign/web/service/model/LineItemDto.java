package com.mydesign.web.service.model;

import java.io.File;
import java.io.Serializable;
import java.util.List;

public class LineItemDto implements Serializable, Searchable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6111975812379014234L;
	
	private String id;
	
	private List<String> thumbnails;
	
	private String category;
	
	private String title;
	
	private String description;
	
	private ProductDto product;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<String> getThumbnails() {
		return thumbnails;
	}

	public void setThumbnails(List<String> thumbnails) {
		this.thumbnails = thumbnails;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ProductDto getProduct() {
		return product;
	}

	public void setProduct(ProductDto product) {
		this.product = product;
	}
	

}
