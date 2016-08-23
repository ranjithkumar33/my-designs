package com.mydesign.business.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mydesign.web.service.model.Searchable;


@RestController
@RequestMapping("search")
public interface SearchService {
	
	@RequestMapping(method=RequestMethod.POST, consumes={"text/plain"}, produces={"application/json"})
	List<Searchable> search(@RequestBody String query);

}
