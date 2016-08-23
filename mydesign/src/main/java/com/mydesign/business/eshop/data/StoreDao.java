package com.mydesign.business.eshop.data;

import com.mydesign.business.eshop.entity.Store;

public interface StoreDao {

	void save(Store s);
	
	Store get(String id);
	
}
