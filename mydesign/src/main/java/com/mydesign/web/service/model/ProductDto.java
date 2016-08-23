package com.mydesign.web.service.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ProductDto extends ShortProductDto implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 2752390240011526125L;

    private String description;

    private String tags = "";

    private String sizes = "[]";

    private String colors = "[]";

    private String specifications = "[]";
    
    private List <ImageDto> images = new ArrayList<>();

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getSizes() {
        return sizes;
    }

    public void setSizes(String sizes) {
        this.sizes = sizes;
    }

    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }

    public List<ImageDto> getImages() {
        return images;
    }

    public void setImages(List<ImageDto> images) {
        this.images = images;
    }

    
}
