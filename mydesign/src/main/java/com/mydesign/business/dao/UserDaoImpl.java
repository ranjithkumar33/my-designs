package com.mydesign.business.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mydesign.business.persistence.UserAccount;

@Repository
public class UserDaoImpl extends BaseDaoImpl<UserAccount> implements UserDao{

	public UserDaoImpl(SessionFactory sessionFactory) {
		super(sessionFactory);
		
	}
	
	@Autowired
	private SessionFactory sessionFactory;
	

	public void saveUser(UserAccount user){
		insert(user);
	}
	
}
