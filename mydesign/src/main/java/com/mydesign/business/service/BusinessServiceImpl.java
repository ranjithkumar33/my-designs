package com.mydesign.business.service;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mydesign.business.dao.BusinessDao;
import com.mydesign.business.persistence.Address;
import com.mydesign.business.persistence.BusinessEntity;
import com.mydesign.business.persistence.ContactInfo;
import com.mydesign.business.persistence.Organiser;
import com.mydesign.business.persistence.Vendor;
import com.mydesign.business.util.CodeUtil;
import com.mydesign.web.service.model.BusinessEntityDto;
import com.mydesign.web.service.model.EBusinessEntityType;
import com.mydesign.web.service.model.EProductType;
import com.mydesign.web.service.model.EVendorType;
import com.mydesign.web.service.model.IBusinessEntity;
import com.mydesign.web.service.model.OrganiserDto;
import com.mydesign.web.service.model.VendorDto;

@Transactional
@Service
public class BusinessServiceImpl implements BusinessService{

	
	Logger logger = LoggerFactory.getLogger(BusinessServiceImpl.class);
	
	@Autowired
	private BusinessDao businessDao;
	
	@Override
	@Transactional(readOnly=false)
	public BusinessEntityDto createBusinessEntity(IBusinessEntity b) {
		BusinessEntityDto dto = (BusinessEntityDto)b;
		Address a = new Address();
		a.setAddress1(dto.getAddress().getAddress1());
		a.setAddress2(dto.getAddress().getAddress2());
		a.setCity(dto.getAddress().getCity());
		
		ContactInfo con= new ContactInfo();
		con.setEmail(dto.getContact().getEmail());
		con.setMobile(dto.getContact().getMobile());
		BusinessEntity bz = null;
		if(null != dto.getEntityType() && EBusinessEntityType.Vendor.equals(dto.getEntityType())){
			bz = new Vendor();
			((Vendor)bz).setProductTypes(Arrays.asList(new EProductType[]{EProductType.Clothes, EProductType.Jewellery, EProductType.Accessories}));
			((Vendor)bz).setType(EVendorType.NonProfitOrganization);
			bz.setAddress(a);
			bz.setCode(CodeUtil.generateCode(EBusinessEntityType.Vendor.toString(), dto.getName()));
			bz.setContact(con);
			bz.setName(dto.getName());
		}else if(null != dto.getEntityType() && EBusinessEntityType.EventOrganiser.equals(dto.getEntityType())){
			bz = new Organiser();
			bz.setAddress(a);
			bz.setCode(CodeUtil.generateCode(EBusinessEntityType.EventOrganiser.toString(), dto.getName()));
			bz.setContact(con);
			bz.setName(dto.getName());
		}
		businessDao.saveBusiness(bz);
		return dto;
	}

}
