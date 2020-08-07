package com.todo.boot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.todo.boot.entity.City;
import com.todo.boot.request.CityRequest;
@Service
@Transactional
public class CityServiceImpl implements ICityService {
	@Autowired
    private ICityDataService  cityDataService;
	@Override
	public List<CityRequest> findAll() {
		List<City> list = cityDataService.listOfAllCity();
		List<CityRequest> cityList = new ArrayList<>();
		list.forEach(c ->{
			CityRequest city = new CityRequest();
			city.setId(c.getId());
			city.setName(c.getCityName());
			cityList.add(city);
		});
		return cityList;
	}

}
