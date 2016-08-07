package com.mydesign.business.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mydesign.web.service.model.CampaignDto;
import com.mydesign.web.service.model.GeneralResponseDto;

@Transactional
@Service
public class CampaignServiceImpl extends BaseServiceImpl implements CampaignService{

	public List<CampaignDto> getAllCampaigns() {
		// TODO Auto-generated method stub
		return null;
	}

	public GeneralResponseDto createCampaign(CampaignDto campaign) {
		return null;
	}

}
