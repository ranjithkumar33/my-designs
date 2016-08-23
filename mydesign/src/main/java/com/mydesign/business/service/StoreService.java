package com.mydesign.business.service;

import com.mydesign.web.service.model.StroreDto;

public interface StoreService {

    StroreDto createStore(StroreDto store);
    
    StroreDto getStore(String id);
    
    StroreDto updateStore(StroreDto store);
    
}
