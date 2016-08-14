package com.mydesign.business.dao;

import java.util.List;

import com.mydesign.business.persistence.Campaign;

public interface CampaignDao {

	void saveCampaign(Campaign c);
	
	List<Campaign> getAllCampaign();
	
	Campaign getCampaign(long id);
	
	
}
