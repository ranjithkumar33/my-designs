package com.mydesign.business.dao;

import org.springframework.stereotype.Repository;

import com.mydesign.business.persistence.UserAccount;


public interface UserDao {
	
	void saveUser(UserAccount user);

}
