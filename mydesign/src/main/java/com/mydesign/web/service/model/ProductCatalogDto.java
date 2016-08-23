package com.mydesign.web.service.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ProductCatalogDto implements Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = 8239222983081810127L;
    
    private String id;
    
    private String name;
    
    private String code;
    
    private List<ShortProductDto> products = new ArrayList<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<ShortProductDto> getProducts() {
        return products;
    }

    public void setProducts(List<ShortProductDto> products) {
        this.products = products;
    }
    

}
