package com.dandelion.service;

import java.util.List;
import java.util.Map;

/**
 *  <p>Title: BaseService </p>
 *  <p>Description: </p>
 *  <p>Company: www.fengmap.com </p> 
 *	@author aaron
 *  @date 2018年4月8日下午12:18:50
 *  @version 1.0
 */
public interface BaseService<E,PK> {

	int add(E e) throws Exception;
	
	int delete(PK pk) throws Exception;
	
	int modify(E e) throws Exception;
	
	E get(PK pk);
	
	List<E> getAll();
	
	List<E> find(E e);
	
	Map<String,Object> findByEntity(E e);
}

