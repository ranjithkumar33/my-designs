package com.mydesign.business.service;

import javax.servlet.http.HttpServletResponse;

import com.mydesign.web.service.model.Subject;
import com.mydesign.web.service.model.UserDto;


public interface UserService extends BaseService{
	
	public UserDto signup(UserDto user);
	
	public UserDto login(Subject subject, HttpServletResponse response) ;

}
