package com.mydesign.business.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mydesign.business.persistence.Campaign;

@Repository
public class CampaignDaoImpl extends BaseDaoImpl<Campaign> implements CampaignDao{

	public CampaignDaoImpl() {
		super(Campaign.class);
	}

	@Override
	public void saveCampaign(Campaign c) {
		insert(c);
	}

	@Override
	public List<Campaign> getAllCampaign() {
		return null;
	}

	@Override
	public Campaign getCampaign(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
