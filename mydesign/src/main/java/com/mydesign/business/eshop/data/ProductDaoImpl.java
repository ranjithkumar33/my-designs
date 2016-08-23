package com.mydesign.business.eshop.data;

import com.mydesign.business.eshop.entity.Product;

public class ProductDaoImpl extends BaseDaoImpl<Product>  implements ProductDao<Product> {

    public ProductDaoImpl() {
	super(Product.class);
    }

    @Override
    public Product get(String id) {
	return get(id);
    }

    @Override
    public void save(Product t) {
	save(t);
    }

}
