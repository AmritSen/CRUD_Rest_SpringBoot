package com.rest.example.crud.dao.impl;

import java.io.Serializable;
import java.util.List;

import com.rest.example.crud.dao.BaseDao;

public class BaseDaoImpl<E> implements BaseDao<E> {

	@Override
	public void saveOrUpdate(E entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean deleteById(Class<?> type, Serializable id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<E> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E findById(Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

}
