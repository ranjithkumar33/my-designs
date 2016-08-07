package com.mydesign.business.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

public class BaseDaoImpl<T> extends HibernateDaoSupport{

	private T t;
	
	private Class<T> clazz;
	
	public BaseDaoImpl(Class<T> clazz, SessionFactory sessionFactory){
	    setSessionFactory(sessionFactory);
	    this.clazz=clazz;
	}
	
	
	protected T insert(T t){
		Long id = (Long) getHibernateTemplate().save(t);
		return getHibernateTemplate().load(clazz, id);
	}
	
	protected T find(String hql, String[] params, Object[] values){
		List ts = getHibernateTemplate().findByNamedParam(hql, params, values);
		if(null != ts && ts.size() > 0){
			return (T)ts.get(0);
		}
		return null;
	}

}
