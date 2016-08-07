package com.mydesign.business.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mydesign.business.persistence.UserAccount;

@Repository
public class UserDaoImpl extends BaseDaoImpl<UserAccount> implements UserDao{

	public UserDaoImpl(SessionFactory sessionFactory) {
		super(UserAccount.class, sessionFactory);
		
	}
	
	@Autowired
	private SessionFactory sessionFactory;
	

	public UserAccount saveUser(UserAccount user){
		return insert(user);
	}


	@Override
	public UserAccount findUserByEmail(String email) {
		return find("select UserAccount  where u.contact.email=:email", new String[]{"email"}, new Object[]{email});
	}


	@Override
	public UserAccount findUserByMobile(String mobile) {
		return find("select UserAccount  where u.contact.mobile=:mobile", new String[]{"mobile"}, new Object[]{mobile});
	}


}
