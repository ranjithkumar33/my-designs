package com.mydesign.business.service;

import javax.servlet.http.HttpServletResponse;

import com.mydesign.web.service.model.SignupShortDto;
import com.mydesign.web.service.model.Subject;
import com.mydesign.web.service.model.UserDto;


public interface UserService {
	
	public UserDto signup(SignupShortDto signup);
	
	public UserDto login(Subject subject, HttpServletResponse response) ;

}
