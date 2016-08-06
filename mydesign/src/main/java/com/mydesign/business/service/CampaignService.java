package com.mydesign.business.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mydesign.web.service.model.CampaignDto;
import com.mydesign.web.service.model.GeneralResponseDto;

@Transactional
@Service
public interface CampaignService extends BaseService{
	
	@RequestMapping(value="campaign", method=RequestMethod.GET, produces={"application/json"})
	public @ResponseBody List<CampaignDto> getAllEvents();
	
	@RequestMapping(method=RequestMethod.POST, produces={"application/json"}, consumes={"application/json"})
	public GeneralResponseDto createCampaign(@RequestBody CampaignDto campaign);

}
