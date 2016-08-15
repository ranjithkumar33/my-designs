package com.mydesign.web.service.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.mydesign.business.service.constant.ECampaignWorkflowStatus;
import com.mydesign.business.service.constant.EProductType;

public class CampaignDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7889783905635387739L;
	
	public CampaignDto(String title, String startDate, String endDate, AddressDto eventLocation, List<EProductType> productTypes){
		this.title=title;
		this.startDate=startDate;
		this.endDate=endDate;
		this.eventLocation=eventLocation;
		this.productTypes=productTypes;
	}
	
	public CampaignDto(){
	
	}
	
	
	private String code;
	
	private String title;
	
	private String startDate;
	
	private String endDate;
	
	private ECampaignWorkflowStatus status;
	
	//Eg:- clothing, food items etc..
	private List<EProductType> productTypes = new ArrayList<>();
	
	private AddressDto eventLocation;
	
	private List<IBusinessEntity> vendors = new ArrayList<>();

	private List<IBusinessEntity> organisers = new ArrayList<>();
	
	private List<SupportingDocumentDto> authorisationSupportingDocuments = new ArrayList<>();
	

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

	public List<IBusinessEntity> getVendors() {
		return vendors;
	}

	public void setVendors(List<IBusinessEntity> vendors) {
		this.vendors = vendors;
	}

	public List<IBusinessEntity> getOrganisers() {
		return organisers;
	}

	public void setOrganisers(List<IBusinessEntity> organisers) {
		this.organisers = organisers;
	}

	public List<EProductType> getProductTypes() {
		return productTypes;
	}

	public void setProductTypes(List<EProductType> productTypes) {
		this.productTypes = productTypes;
	}

	public AddressDto getEventLocation() {
		return eventLocation;
	}

	public void setEventLocation(AddressDto eventLocation) {
		this.eventLocation = eventLocation;
	}

	public List<SupportingDocumentDto> getAuthorisationSupportingDocuments() {
		return authorisationSupportingDocuments;
	}

	public void setAuthorisationSupportingDocuments(
			List<SupportingDocumentDto> authorisationSupportingDocuments) {
		this.authorisationSupportingDocuments = authorisationSupportingDocuments;
	}

	public ECampaignWorkflowStatus getStatus() {
		return status;
	}

	public void setStatus(ECampaignWorkflowStatus status) {
		this.status = status;
	}

	

}
