package com.mydesign.web.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mydesign.business.service.UserService;
import com.mydesign.web.service.model.SignupShortDto;
import com.mydesign.web.service.model.Subject;
import com.mydesign.web.service.model.UserDto;

@RestController
public class UserController extends BaseController{
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/ping", method=RequestMethod.GET)
	public String ping() {
		return "Success";
	}
	
	//{"name":"Test user 11", "emailOrMobile":"9946999373", "password":"testuser123"}
	@RequestMapping(value="/user/signup", method=RequestMethod.POST, produces={"application/json"})
	public UserDto signup(@RequestBody SignupShortDto signup){
		return userService.signup(signup);
	}
	
	//{"principal":"ranjith@test.com", "password":"testuser123"}
	@RequestMapping(value="/user/login", method=RequestMethod.POST, produces={"application/json"})
	public UserDto login(@RequestBody Subject subject, HttpServletResponse response){
		return userService.login(subject, response);
	}
	

}
