package com.mydesign.web.service.model;

import java.io.File;
import java.io.Serializable;
import java.util.List;

public class ProductDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2752390240011526125L;
	
	private String name;
	
	private String code;
	
	private List<String> mediumSizeImages;
	
	private List<String> detailedImages;
	
	private SpecificationDto specification;
	
	private String tags;
	
	private int likes;
	

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

	public List<String> getMediumSizeImages() {
		return mediumSizeImages;
	}

	public void setMediumSizeImages(List<String> mediumSizeImages) {
		this.mediumSizeImages = mediumSizeImages;
	}

	public List<String> getDetailedImages() {
		return detailedImages;
	}

	public void setDetailedImages(List<String> detailedImages) {
		this.detailedImages = detailedImages;
	}

	public SpecificationDto getSpecification() {
		return specification;
	}

	public void setSpecification(SpecificationDto specification) {
		this.specification = specification;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	
}
