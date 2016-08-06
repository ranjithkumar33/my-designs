package com.mydesign.web.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mydesign.web.service.model.CampaignDto;
import com.mydesign.web.service.model.GeneralResponseDto;


@RestController
public class CampaignController extends BaseController{
	@RequestMapping(value="campaign", method=RequestMethod.GET, produces={"application/json"})
	public @ResponseBody List<CampaignDto> getAllEvents(){
		return null;
	}
	
	
	
	@RequestMapping(value="campaign", method=RequestMethod.POST, produces={"application/json"}, consumes={"application/json"})
	public GeneralResponseDto createCampaign(@RequestBody CampaignDto campaign){
		return null;
	}

}
