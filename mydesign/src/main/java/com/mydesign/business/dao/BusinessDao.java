package com.mydesign.business.dao;

import com.mydesign.business.persistence.BusinessEntity;

public interface BusinessDao {

	void saveBusiness(BusinessEntity bz);
	
	BusinessEntity getBusiness(long id);
}
