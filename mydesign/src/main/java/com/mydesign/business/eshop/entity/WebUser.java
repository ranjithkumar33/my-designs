package com.mydesign.business.eshop.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("WEBUSER")
public class WebUser extends User{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7271368315653598698L;

}
