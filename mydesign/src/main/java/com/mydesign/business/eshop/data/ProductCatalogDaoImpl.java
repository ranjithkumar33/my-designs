package com.mydesign.business.eshop.data;

import com.mydesign.business.eshop.entity.ProductCatalog;

public class ProductCatalogDaoImpl extends BaseDaoImpl<ProductCatalog> implements ProductCatalogDao<ProductCatalog>{

	public ProductCatalogDaoImpl() {
		super(ProductCatalog.class);
	}

	@Override
	public ProductCatalog get(String id) {
		return get(id);
	}

	public void save(ProductCatalog t) {
		save(t);
	}

	
}
