package com.mydesign.web.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mydesign.web.service.model.GeneralResponseDto;

@RestController
@RequestMapping("subscribe")
public class SubscriptionController extends BaseController{

	//@Autowired
	//private SubscriptionService subscriptionService;
	
	@RequestMapping(method=RequestMethod.POST, consumes={"text/plain"}, produces={"application/json"})
	public GeneralResponseDto subscribe(@RequestBody String contact){
		return null;//subscriptionService.subscribe(contact);
	}
	
	
}
