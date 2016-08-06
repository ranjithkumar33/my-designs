package com.mydesign.web.service.model;

import java.io.Serializable;

public class CampaignDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7889783905635387739L;
	
	public CampaignDto(String name, String title, String startDate, String endDate){
		this.name=name;
		this.title=title;
		this.startDate=startDate;
		this.endDate=endDate;
	}
	
	public CampaignDto(){
	
	}
	
	private String name;
	
	private String code;
	
	private String title;
	
	private String startDate;
	
	private String endDate;
	
	//Eg:- clothing, food items etc..
	private String category;
	
	private AddressDto venue;

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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public AddressDto getVenue() {
		return venue;
	}

	public void setVenue(AddressDto venue) {
		this.venue = venue;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	

}
