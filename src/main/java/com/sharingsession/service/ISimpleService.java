package com.sharingsession.service;

import java.util.List;

import com.sharingsession.model.SimpleObject;

public interface ISimpleService {
	
	public void saveOrUpdate(SimpleObject object);
	
	public SimpleObject findById(Long id);
	
	public List<SimpleObject> findAll();
	
	public SimpleObject delete(Long id);
	
}
