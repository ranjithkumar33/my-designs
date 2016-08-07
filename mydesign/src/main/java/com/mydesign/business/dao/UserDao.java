package com.mydesign.business.dao;

import com.mydesign.business.persistence.UserAccount;


public interface UserDao {
	
	UserAccount saveUser(UserAccount user);
	
	UserAccount findUserByEmail(String email);
	
	UserAccount findUserByMobile(String mobile);

}
