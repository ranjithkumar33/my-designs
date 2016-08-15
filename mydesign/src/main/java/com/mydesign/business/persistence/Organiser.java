package com.mydesign.business.persistence;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="organiser")
@DiscriminatorValue("organiser")
public class Organiser extends BusinessEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4878114082936303559L;

	
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "organisers")
	private List<Campaign> campaigns = new ArrayList<>();


	public List<Campaign> getCampaigns() {
		return campaigns;
	}


	public void setCampaigns(List<Campaign> campaigns) {
		this.campaigns = campaigns;
	}
	
}
