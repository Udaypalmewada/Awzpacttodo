package com.todo.boot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.todo.boot.entity.City;
@Repository
public interface ICityRepository extends JpaRepository<City, Integer>{

	public abstract List<City> findAll();
	
	public abstract City findCityById(Integer id) ;
}
