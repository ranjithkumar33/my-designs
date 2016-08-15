package com.mydesign.business.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="supporting_document")
public class SupportingDocument extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8896919201078077155L;
	
	@Column
	private String name;
	
	@Column
	private String mimeType;
	
	@Column
	private long size;
	
	@Column
	private byte[] file;
	
	@ManyToOne
	private Campaign campaign;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMimeType() {
		return mimeType;
	}

	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}

	public byte[] getFile() {
		return file;
	}

	public void setFile(byte[] file) {
		this.file = file;
	}

	public Campaign getCampaign() {
		return campaign;
	}

	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}

}
