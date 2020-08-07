package com.todo.boot.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.todo.boot.entity.RegistrationModel;
import com.todo.boot.request.RegisterRequest;

@Service
public interface IUserDataService {
	public int saveUser(RegisterRequest register);
	public boolean checkUserExistance(RegistrationModel register);
	public List listOfAllUsers();
	
}
