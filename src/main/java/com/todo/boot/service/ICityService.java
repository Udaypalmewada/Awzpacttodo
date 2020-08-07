package com.todo.boot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.todo.boot.request.CityRequest;
@Service
public interface ICityService {
	public abstract List<CityRequest> findAll();
}
