package com.mydesign.business.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mydesign.web.service.model.LineItemDto;

@RestController
@RequestMapping("display/")
public interface SalesService extends BaseService{
	
	@RequestMapping(value="category", method=RequestMethod.GET, produces={"application/json"})
	List<String> getAllCategories();
	

	@RequestMapping(value="category/{campaignCode}/{categoryName}", method=RequestMethod.GET, produces={"application/json"})
	List<LineItemDto> getSaleItemsPerCategory(@PathVariable("campaignCode") String eventCode, @PathVariable("categoryName") String categoryName);
	
	
	@RequestMapping(value="item/{campaignCode}", method=RequestMethod.GET, produces={"application/json"})
	List<LineItemDto> getAllSaleItems(@PathVariable("campaignCode") String eventCode);
	
	
	@RequestMapping(value="item/{itemId}", method=RequestMethod.GET, produces={"application/json"})
	LineItemDto getSaleItem(@PathVariable("itemId") String itemId);
}
