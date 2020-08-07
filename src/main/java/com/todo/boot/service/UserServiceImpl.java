package com.todo.boot.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.todo.boot.entity.RegistrationModel;
import com.todo.boot.request.RegisterRequest;

@Service
@Transactional
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private IUserDataService userDataService;
	public int saveUser(RegisterRequest register) {
		return userDataService.saveUser(register);
	}
	public boolean checkUserExistance(RegistrationModel register) {
		return userDataService.checkUserExistance(register);
	}
	public List listOfAllUsers() {
		List user = new ArrayList();
		List list = userDataService.listOfAllUsers();
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			RegistrationModel reg = (RegistrationModel)itr.next();
			user.add(reg);
		}
		return user;
	}
}
