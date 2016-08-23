package com.mydesign.web.service.model;

import java.io.Serializable;

public class ImageDto implements Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = -4915507263491353991L;
    
    private String thumbnailUrl;
    
    private String mediumImageUrl;

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public String getMediumImageUrl() {
        return mediumImageUrl;
    }

    public void setMediumImageUrl(String mediumImageUrl) {
        this.mediumImageUrl = mediumImageUrl;
    }

}
