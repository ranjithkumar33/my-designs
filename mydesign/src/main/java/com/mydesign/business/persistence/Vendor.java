package com.mydesign.business.persistence;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.mydesign.business.service.constant.EProductType;
import com.mydesign.business.service.constant.EVendorType;

@Entity
@Table(name="vendor")
@DiscriminatorValue("vendor")
public class Vendor extends BusinessEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3819775107552997492L;
	
	@Enumerated(EnumType.STRING)
	@Column
	private EVendorType type;
	
	@Column
	private String productTypes = "[]";
	
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "vendors")
	private List<Campaign> campaigns = new ArrayList<>();
	
	public EVendorType getType() {
		return type;
	}

	public void setType(EVendorType type) {
		this.type = type;
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

	public List<Campaign> getCampaigns() {
		return campaigns;
	}

	public void setCampaigns(List<Campaign> campaigns) {
		this.campaigns = campaigns;
	}

}
