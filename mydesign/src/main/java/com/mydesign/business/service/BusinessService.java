package com.mydesign.business.service;

import com.mydesign.web.service.model.BusinessEntityDto;
import com.mydesign.web.service.model.IBusinessEntity;

public interface BusinessService {
	
	BusinessEntityDto createBusinessEntity(IBusinessEntity b);

}
