package com.todo.boot.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.todo.boot.entity.UserLoginModel;
@Service
@Transactional
public class UserLoginServiceImpl implements IUserloginService {

	@Autowired
	private IUserloginDataService userLoginDataService;
	@Override
	public boolean checkUserExistance(UserLoginModel login) {
		return userLoginDataService.checkUserExistance(login);
		 
	}

}
