package com.sharingsession.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sharingsession.model.SimpleObject;

@Service
public class SimpleService implements ISimpleService {
	
	@Autowired
	private List<SimpleObject> repositories;

	@Override
	public void saveOrUpdate(SimpleObject object) {
		SimpleObject existSo = findById(object.getId());
		if (existSo != null) {
			repositories.remove(existSo);
		}
		repositories.add(object);
	}

	@Override
	public SimpleObject findById(Long id) {
		if (!repositories.isEmpty()) {
			for (SimpleObject obj : repositories) {
				if (obj.getId().equals(id)) {
					return obj;
				}
			}
		}
		return null;
	}

	@Override
	public List<SimpleObject> findAll() {
		return repositories;
	}

	@Override
	public SimpleObject delete(Long id) {
		SimpleObject so = findById(id);
		if (so != null) {
			repositories.remove(so);
			return so;
		}
		return null;
	}

}
