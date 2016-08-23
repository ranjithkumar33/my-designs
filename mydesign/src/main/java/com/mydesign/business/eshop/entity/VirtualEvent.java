package com.mydesign.business.eshop.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("VIRTUAL")
public class VirtualEvent extends Event{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6281029054767970259L;
	
	@Column(name="link")
	private String link;

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}
	

}
