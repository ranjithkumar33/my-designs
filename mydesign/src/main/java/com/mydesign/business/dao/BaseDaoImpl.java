package com.mydesign.business.dao;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

public class BaseDaoImpl<T> extends HibernateDaoSupport{

	private T t;
	
	public BaseDaoImpl(SessionFactory sessionFactory){
	    setSessionFactory(sessionFactory);
	}
	
	
	protected void insert(T t){
		getHibernateTemplate().save(t);
	}

}
