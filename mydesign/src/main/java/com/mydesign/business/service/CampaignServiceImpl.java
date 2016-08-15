package com.mydesign.business.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mydesign.business.dao.BusinessDao;
import com.mydesign.business.dao.CampaignDao;
import com.mydesign.business.persistence.Address;
import com.mydesign.business.persistence.Campaign;
import com.mydesign.business.persistence.Organiser;
import com.mydesign.business.persistence.Vendor;
import com.mydesign.business.service.constant.ECampaignWorkflowStatus;
import com.mydesign.business.service.constant.EProductType;
import com.mydesign.business.util.CodeUtil;
import com.mydesign.web.service.model.CampaignDto;
import com.mydesign.web.service.model.GeneralResponseDto;

@Transactional
@Service
public class CampaignServiceImpl implements CampaignService{

	Logger logger = LoggerFactory.getLogger(CampaignServiceImpl.class);
	
	@Autowired
	private CampaignDao campaignDao;
	
	@Autowired
	private BusinessDao businessDao;

	public List<CampaignDto> getAllCampaigns() {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional(readOnly=false)
	public GeneralResponseDto createCampaign(CampaignDto campaign) {
		
		Campaign c = new Campaign();
		c.setCode(CodeUtil.generateCode("Campaign", "Leela season sale"));
		c.setEndDate(getDateByIndex(10));
		c.setStartDate(getDateByIndex(2));
		
		Address a =  new Address();
		a.setAddress1("address1");
		a.setAddress2("address2");
		a.setCity("Trivandrm");
		a.setLocality("lloor");
		a.setState("Kerala");
		
		c.setEventLocation(a);
		List<Organiser> ol = new ArrayList<>();
		ol.add((Organiser)businessDao.getBusiness("40282e81568e578701568e5863f70005"));
		c.setOrganisers(ol);
		
		c.setProductTypes(Arrays.asList(new EProductType[]{EProductType.Clothes, EProductType.Jewellery}));
		c.setStatus(ECampaignWorkflowStatus.Submitted);
		c.setTitle("Leela season sale");
		
		List<Vendor> vl = new ArrayList<>();
		vl.add((Vendor)businessDao.getBusiness("40282e81568e578701568e582e670002"));
		c.setVendors(vl);
		campaignDao.saveCampaign(c);
		return null;
	}

	private Date getDateByIndex(int amount){
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DAY_OF_MONTH, amount);
		return c.getTime();
		
	}
	
	

}
