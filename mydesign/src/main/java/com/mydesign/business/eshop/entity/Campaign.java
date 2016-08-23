package com.mydesign.business.eshop.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class Campaign extends BaseEntity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1569463905501353910L;

	@Column(name="title")
	private String title;
	
	@Column(name="from")
	private Date from;
	
	@Column(name="to")
	private Date to;
	
	@OneToOne
	@JoinColumn(name="vendor_id")
	private Vendor doneBy;
	
	@OneToOne
	@JoinColumn(name="event_id")
	private Event campaignFor;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getFrom() {
		return from;
	}

	public void setFrom(Date from) {
		this.from = from;
	}

	public Date getTo() {
		return to;
	}

	public void setTo(Date to) {
		this.to = to;
	}

	public Vendor getDoneBy() {
		return doneBy;
	}

	public void setDoneBy(Vendor doneBy) {
		this.doneBy = doneBy;
	}

	public Event getCampaignFor() {
		return campaignFor;
	}

	public void setCampaignFor(Event campaignFor) {
		this.campaignFor = campaignFor;
	}

}
