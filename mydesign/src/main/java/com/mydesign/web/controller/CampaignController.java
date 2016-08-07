package com.mydesign.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mydesign.business.service.CampaignService;
import com.mydesign.web.service.model.CampaignDto;
import com.mydesign.web.service.model.GeneralResponseDto;


@RestController
public class CampaignController extends BaseController{
	
	@Autowired
	private CampaignService campaignService;
	
	@RequestMapping(value="campaign", method=RequestMethod.GET, produces={"application/json"})
	public @ResponseBody List<CampaignDto> getAllCampaigns(){
		return campaignService.getAllCampaigns();
	}
	
	
	
	@RequestMapping(value="campaign", method=RequestMethod.POST, produces={"application/json"})
	public GeneralResponseDto createCampaign(@RequestBody CampaignDto campaign){
		return campaignService.createCampaign(campaign);
	}

}
