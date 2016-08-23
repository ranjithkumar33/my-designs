package com.mydesign.business.eshop.data;

import java.io.Serializable;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseDaoImpl <T>{

	private Class<T> clazz;
	
	public BaseDaoImpl(Class<T> clazz){
	    this.clazz=clazz;
	}
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	protected void save(T t){
		sessionFactory.getCurrentSession().saveOrUpdate(t);
	}
	
	@SuppressWarnings("unchecked")
	protected T get(Serializable id){
		return (T)sessionFactory.getCurrentSession().get(clazz, id);
	}
	
	@SuppressWarnings("unchecked")
	protected T update(T t){
		return (T)sessionFactory.getCurrentSession().merge(t);
	}
	
	protected void delete(T t){
		sessionFactory.getCurrentSession().delete(t);
	}
}
