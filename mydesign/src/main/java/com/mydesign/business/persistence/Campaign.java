package com.mydesign.business.persistence;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.mydesign.web.service.model.ECampaignWorkflowStatus;
import com.mydesign.web.service.model.EProductType;

@Entity
@Table(name="campaign")
public class Campaign extends BaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7932084079233330550L;
	
	
	
	@Column
	private String code;
	
	@Column
	private String title;
	
	@Temporal(TemporalType.DATE)
	@Column
	private Date startDate;
	
	@Temporal(TemporalType.DATE)
	@Column
	private Date endDate;

	@Enumerated(EnumType.STRING)
	@Column
	private ECampaignWorkflowStatus status;
	
	@Column
	private String productTypes = "[]";
	
	
	@OneToOne(cascade=CascadeType.ALL)
	private Address eventLocation;
	
    @ManyToMany
    @JoinTable(name="campaign_vendor", joinColumns={@JoinColumn(name="campaign_id", nullable=false)}, inverseJoinColumns={@JoinColumn(name="vendor_id")})
	private List<Vendor> vendors = new ArrayList<>();

	@ManyToMany
	@JoinTable(name="campaign_organiser", joinColumns={@JoinColumn(name="campaign_id", nullable=false)}, inverseJoinColumns={@JoinColumn(name="organiser_id")})
	private List<Organiser> organisers = new ArrayList<>();

	@OneToMany
	@JoinColumn(name="campaign_id")
	private List<SupportingDocument> supportingDocuments = new ArrayList<>();
	
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

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public ECampaignWorkflowStatus getStatus() {
		return status;
	}

	public void setStatus(ECampaignWorkflowStatus status) {
		this.status = status;
	}

	public List<EProductType> getProductTypes() {///
		List<EProductType> list = null;
		try {
			list = mapper.readValue(productTypes, new TypeReference<List<EProductType>>(){});
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}

	public void setProductTypes(List<EProductType> productTypes) {
		try {
			this.productTypes = mapper.writeValueAsString(productTypes);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}

	public Address getEventLocation() {
		return eventLocation;
	}

	public void setEventLocation(Address eventLocation) {
		this.eventLocation = eventLocation;
	}

	public List<Vendor> getVendors() {
		return vendors;
	}

	public void setVendors(List<Vendor> vendors) {
		this.vendors = vendors;
	}

	public List<Organiser> getOrganisers() {
		return organisers;
	}

	public void setOrganisers(List<Organiser> organisers) {
		this.organisers = organisers;
	}

	public List<SupportingDocument> getSupportingDocuments() {
		return supportingDocuments;
	}

	public void setSupportingDocuments(List<SupportingDocument> supportingDocuments) {
		this.supportingDocuments = supportingDocuments;
	}

	
}
