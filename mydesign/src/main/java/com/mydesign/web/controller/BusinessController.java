package com.mydesign.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mydesign.business.service.BusinessService;
import com.mydesign.web.service.model.BusinessEntityDto;

@RestController
public class BusinessController extends BaseController{

	
	@Autowired
	private BusinessService businessService;
	
	
	//{"name":"Vedika", "entityType":"Vendor",  "address":{"address1":"xxxx", "address2":"xxxx", "city":"trvx","state":"keralax", "locality":"ullooor", "pin":"25333542"}, "contact":{"telephone":"0495201470x", "mobile":"9946999373x", "email":"test@test.comx"}}
	@RequestMapping(value="/business", method=RequestMethod.POST, produces={"application/json"})
	public BusinessEntityDto signup(@RequestBody BusinessEntityDto bz){
		return businessService.createBusinessEntity(bz);
	}
}
