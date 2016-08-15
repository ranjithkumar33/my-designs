package com.mydesign.business.dao;

import org.springframework.stereotype.Repository;

import com.mydesign.business.persistence.BusinessEntity;

@Repository
public class BusinessDaoImpl extends BaseDaoImpl<BusinessEntity> implements BusinessDao{

	public BusinessDaoImpl() {
		super(BusinessEntity.class);
	}

	@Override
	public void saveBusiness(BusinessEntity bz) {
		insert(bz);
	}

	@Override
	public BusinessEntity getBusiness(String id) {
		return load(id);
	}

}
