package com.todo.boot.service;
import org.springframework.stereotype.Service;

import com.todo.boot.entity.UserLoginModel;
@Service
public interface IUserloginService {
	public boolean checkUserExistance(UserLoginModel login);
	
}
