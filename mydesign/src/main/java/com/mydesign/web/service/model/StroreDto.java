package com.mydesign.web.service.model;

import java.io.Serializable;

public class StroreDto implements Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = 287313810117423541L;
    
    private String id;
    
    private String name;
    
    private String code;
    
    private String description;
    
    private UserDto createdBy;
    
    private String openedOn;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UserDto getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(UserDto createdBy) {
        this.createdBy = createdBy;
    }

    public String getOpenedOn() {
        return openedOn;
    }

    public void setOpenedOn(String openedOn) {
        this.openedOn = openedOn;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    

}
