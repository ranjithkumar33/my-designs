package com.mydesign.business.eshop.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="event")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE) 
@DiscriminatorColumn(name="event_type")
public abstract class Event extends BaseEntity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1427993489772861122L;

	@Column(name="name")
	private String name;
	
	@Column(name="from")
	private Date from;
	
	@Column(name="to")
	private Date to;
	
	
}
