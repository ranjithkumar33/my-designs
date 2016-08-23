package com.mydesign.business.eshop.data;


public interface ProductCatalogDao <T>{
	
	void save(T s);
	
	T get(String id);
	
}
