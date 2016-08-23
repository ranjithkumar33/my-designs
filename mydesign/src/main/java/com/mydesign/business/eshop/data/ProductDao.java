package com.mydesign.business.eshop.data;

public interface ProductDao<T> {

    void save(T t);

    T get(String id);
}
