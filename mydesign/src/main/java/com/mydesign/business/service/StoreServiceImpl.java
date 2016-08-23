package com.mydesign.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mydesign.business.eshop.data.StoreDao;
import com.mydesign.business.eshop.entity.Store;
import com.mydesign.business.eshop.entity.User;
import com.mydesign.web.service.model.StroreDto;
import com.mydesign.web.service.model.UserDto;

@Service
@Transactional
public class StoreServiceImpl implements StoreService{

    @Autowired
    private StoreDao storeDao;
    
    @Override
    public StroreDto createStore(StroreDto store) {
	Store entity = new Store();
	entity.setName(store.getName());
	//entity.setCreatedBy("");
	entity.setDescription(store.getDescription());
	//entity.setOpenedBy("");
	
	try {
	    storeDao.save(entity);
	    store = getStore(entity.getId());
	} catch (Exception e) {
	  System.out.println(e);
	}
	return store;
    }

    @Override
    public StroreDto getStore(String id) {
	Store entity = storeDao.get(id);
	StroreDto dto = new StroreDto();
	dto.setId(entity.getId());
	dto.setCode(entity.getCode());
	dto.setDescription(entity.getDescription());
	User user = entity.getOpenedBy();
	UserDto ud = new UserDto();
	dto.setCreatedBy(ud);
	return dto;
    }

    @Override
    public StroreDto updateStore(StroreDto store) {
	// TODO Auto-generated method stub
	return null;
    }

}
