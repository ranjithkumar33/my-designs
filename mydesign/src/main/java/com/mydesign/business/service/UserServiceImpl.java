package com.mydesign.business.service;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.mydesign.business.dao.UserDao;
import com.mydesign.business.persistence.UserAccount;
import com.mydesign.web.service.model.Permission;
import com.mydesign.web.service.model.Subject;
import com.mydesign.web.service.model.UserDto;

@Transactional
@Service
public class UserServiceImpl implements UserService{
	
	private static final String HTTP_AUTHORIZATION_HEADER = "Authorization";
	
	@Autowired
	private UserDao userDao;

	
	@Transactional(readOnly=false)
	public UserDto signup(UserDto user) {
		UserAccount u = new UserAccount();
		u.setName("Ranjith kumar A P");
		userDao.saveUser(u);
		return null;
	}

	public UserDto login(Subject subject, HttpServletResponse response) {
	    authenticate(subject);
	    postAuthentication(subject, response);
		return null;
	}

	private void postAuthentication(Subject subject, HttpServletResponse response) {
		
		response.addHeader(HTTP_AUTHORIZATION_HEADER, computeHeaderValue(subject));
		
		
	}

	private String computeHeaderValue(Subject subject) {
		
		return subject.getPrincipal();
	}

	private void authenticate(Subject subject) {
		
	}

	

	public void checkPermission(Permission permission) {
		// TODO Auto-generated method stub
		
	}

}
