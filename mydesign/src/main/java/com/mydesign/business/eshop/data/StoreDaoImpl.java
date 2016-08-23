package com.mydesign.business.eshop.data;

import org.springframework.stereotype.Repository;

import com.mydesign.business.eshop.entity.Store;

@Repository
public class StoreDaoImpl extends BaseDaoImpl<Store> implements StoreDao{

	public StoreDaoImpl() {
		super(Store.class);
	}
	
	@Override
	public void save(Store t) {
		save(t);
	}

	@Override
	public Store get(String id) {
		return get(id);
	}

}
