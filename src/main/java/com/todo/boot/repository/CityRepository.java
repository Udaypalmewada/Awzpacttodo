package com.todo.boot.repository;

import java.util.List;

import org.springframework.stereotype.Service;

import com.todo.boot.entity.City;
/**
 * @author UDAY JAVA
 *Repositry Implementation for Interface City .
 */
@Service
public abstract class CityRepository implements ICityRepository{


	@Override
	public abstract List<City> findAll();
	
	public abstract City findCityById(Integer id) ;
}
	

