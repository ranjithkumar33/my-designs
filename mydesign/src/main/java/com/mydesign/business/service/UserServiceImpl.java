package com.mydesign.business.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mydesign.business.dao.UserDao;
import com.mydesign.business.persistence.ContactInfo;
import com.mydesign.business.persistence.UserAccount;
import com.mydesign.web.service.model.Permission;
import com.mydesign.web.service.model.SignupShortDto;
import com.mydesign.web.service.model.Subject;
import com.mydesign.web.service.model.UserDto;

@Transactional
@Service
public class UserServiceImpl implements UserService{
	
	Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	
	private static final String MOBILE_REGX = "^[7-9][0-9]{9}$";
	
	private static final String EMAIL_REGX = "/^(\\+\\d{1,3}[- ]?)?\\d{10}$/";
	
	private static final String HTTP_AUTHORIZATION_HEADER = "Authorization";
	
	@Autowired
	private UserDao userDao;

	private enum ContactType{
		Mobile, Email
	}
	
	@Transactional(readOnly=false)
	public UserDto signup(SignupShortDto signup) {
		logger.info("Signing up user > ", signup);
		UserDto user = null;
		ContactType type = getContactType(signup.getEmailOrMobile());
		switch(type){
			case Mobile :
				user = signUpUser(ContactType.Mobile, signup);
			break;
			case Email :
				user = signUpUser(ContactType.Email, signup);
			break;
			default:
				throw new RuntimeException("Invalid email or mobile!");
		}
		return user;
	}
	
	private UserDto signUpUser(ContactType type, SignupShortDto signup) {
		UserAccount u = new UserAccount();
		u.setName(signup.getName());
		u.setPassword(getEncryptedPassword(signup.getPassword()));
		ContactInfo c = new ContactInfo();
		if(type.equals(ContactType.Mobile)){
			c.setMobile(signup.getEmailOrMobile());
		}else if(type.equals(ContactType.Email)){
			c.setEmail(signup.getEmailOrMobile());
		}
		u.setContact(c);
		u = userDao.saveUser(u);
		
		UserDto user = new UserDto();
		user.setName(u.getName());
		user.setId(u.getId());
		return user;
	}

	public UserDto login(Subject subject, HttpServletResponse response) {
	    authenticate(subject);
	    postAuthentication(subject, response);
		return null;
	}

	private ContactType getContactType(String emailOrMobile) {
		if(null == emailOrMobile) throw new RuntimeException("Email or mobile is required.");		
			
		if(validateMobile(emailOrMobile)){
			return ContactType.Mobile;
		}else if(validateEmail(emailOrMobile)){
			return ContactType.Email;
		}
		return null;
	}
	
	private boolean validateMobile(String emailOrMobile){
		Pattern p = Pattern.compile(MOBILE_REGX);
		Matcher m = p.matcher(emailOrMobile);
		if(m.matches()){
			return true;		
		}
		return false;
	}
	
	private boolean validateEmail(String emailOrMobile){
		if(null != emailOrMobile && emailOrMobile.contains("@")){
			return true;		
		}
		return false;
	}

	
	private String getEncryptedPassword(String password){
		Cipher cipher = new Cipher();
		String encryptedPassword = cipher.encrypt(password);
		return encryptedPassword;
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
