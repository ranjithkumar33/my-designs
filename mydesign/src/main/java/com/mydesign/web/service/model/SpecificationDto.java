package com.mydesign.web.service.model;

import java.io.Serializable;
import java.util.List;

public class SpecificationDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7093711566740367418L;
	
	private int size;
	
	private String color;
	
	private List<String> details;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public List<String> getDetails() {
		return details;
	}

	public void setDetails(List<String> details) {
		this.details = details;
	}

}
