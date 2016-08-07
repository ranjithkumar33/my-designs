package com.mydesign.business.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.mydesign.business.persistence.UserAccount;

@Repository
public class UserDaoImpl extends BaseDaoImpl<UserAccount> implements UserDao{

	public UserDaoImpl() {
		super(UserAccount.class);
		
	}

	public UserAccount saveUser(UserAccount user){
		insert(user);
		return load(user.getId());
	}


	@Override
	public UserAccount findUserByEmail(String email) {
		Map<String, String> paramMap = new HashMap<String, String>();
		paramMap.put("email", email);
		List<UserAccount> users = findByNamedQuery("User.findUserByEmail", paramMap);
		if(null != users && users.size() > 0){
			return users.get(0);
		}
		return null;
	}


	@Override
	public UserAccount findUserByMobile(String mobile) {
		Map<String, String> paramMap = new HashMap<String, String>();
		paramMap.put("mobile", mobile);
		List<UserAccount> users = findByNamedQuery("User.findUserByMobile", paramMap);
		if(null != users && users.size() > 0){
			return users.get(0);
		}
		return null;
	}


}
