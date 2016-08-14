package com.mydesign.business.dao;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseDaoImpl<T> {

	private T t;
	
	private Class<T> clazz;
	
	public BaseDaoImpl(Class<T> clazz){
	    this.clazz=clazz;
	}
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	protected void insert(T t){
		sessionFactory.getCurrentSession().saveOrUpdate(t);
	}
	
	protected T load(Serializable id){
		return (T)sessionFactory.getCurrentSession().get(clazz, id);
	}
	
	protected List<T> findByNamedQuery(String namedQuery, Map<String, String> paramMap){
		List<T> results = Collections.emptyList();
		try{
			Query query = sessionFactory.getCurrentSession().getNamedQuery(namedQuery);
			  if(null != paramMap && !paramMap.isEmpty()){
				  Set<Entry<String, String>> eSet = paramMap.entrySet();
				  if(null != eSet && !eSet.isEmpty()){
					  for(Entry<String, String> entry : eSet){
						  query.setParameter(entry.getKey(), entry.getValue());
					  }
				  }
			  }
			results = query.list();
		}catch (Exception e) {
			throw e;
		}
		return results;
	}
	
	

}
