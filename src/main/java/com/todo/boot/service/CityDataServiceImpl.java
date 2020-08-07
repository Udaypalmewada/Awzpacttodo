package com.todo.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.boot.repository.CityRepository;
import com.todo.boot.repository.ICityRepository;

@Service
public class CityDataServiceImpl implements ICityDataService {
	@Autowired
	private ICityRepository cityRepository;

	@Override
	public List listOfAllCity() {
		List list = cityRepository.findAll();
		if (!list.isEmpty()) {
			return list;
		}
		return null;
	}

}
