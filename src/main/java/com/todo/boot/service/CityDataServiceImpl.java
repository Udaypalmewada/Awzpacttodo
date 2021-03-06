package com.todo.boot.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.boot.TodoApplication;
import com.todo.boot.repository.ICityRepository;

@Service
public class CityDataServiceImpl implements ICityDataService {
	private static final Logger LOGGER=LoggerFactory.getLogger(TodoApplication.class);
	@Autowired
	private ICityRepository cityRepository;

	@Override
	public List listOfAllCity() {
		List list = cityRepository.findAll();
		if (!list.isEmpty()) {
			LOGGER.error("list is empty{}", java.time.LocalDate.now());
			return list;
		}
		return null;
	}

}
