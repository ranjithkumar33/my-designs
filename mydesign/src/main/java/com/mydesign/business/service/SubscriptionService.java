package com.mydesign.business.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mydesign.web.service.model.GeneralResponseDto;


@Transactional
@Service
public interface SubscriptionService {
	
	GeneralResponseDto subscribe(String contact);

}
