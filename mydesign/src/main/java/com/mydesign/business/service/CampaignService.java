package com.mydesign.business.service;

import java.util.List;

import com.mydesign.web.service.model.CampaignDto;
import com.mydesign.web.service.model.GeneralResponseDto;


public interface CampaignService extends BaseService{
	
	public List<CampaignDto> getAllCampaigns();
	
	public GeneralResponseDto createCampaign(CampaignDto campaign);

}
