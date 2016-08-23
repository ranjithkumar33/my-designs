package com.mydesign.web.service.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ShortProductDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2752390240011526125L;
	
	private String id;
	
	private String name;
	
	private String code;
	
	private String type;
	
	private String status;
	
	private List<String> thumbnails = new ArrayList<>();

	public String getId() {
	    return id;
	}

	public void setId(String id) {
	    this.id = id;
	}

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

	public String getType() {
	    return type;
	}

	public void setType(String type) {
	    this.type = type;
	}

	public List<String> getThumbnails() {
	    return thumbnails;
	}

	public void setThumbnails(List<String> thumbnails) {
	    this.thumbnails = thumbnails;
	}

	public String getStatus() {
	    return status;
	}

	public void setStatus(String status) {
	    this.status = status;
	}
	
}
