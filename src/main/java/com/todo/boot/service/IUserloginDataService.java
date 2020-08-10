package com.todo.boot.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.todo.boot.TodoApplication;
import com.todo.boot.entity.UserLoginModel;
import com.todo.boot.repository.IUserLoginRepositry;

@Repository
public class IUserloginDataService {
	private static final Logger LOGGER=LoggerFactory.getLogger(TodoApplication.class);
	@Autowired
	private IUserLoginRepositry userLoginRepositry;

	public boolean checkUserExistance(UserLoginModel login) {
		long id = 0l;
		id = userLoginRepositry.countByNameLikeAndPasswordLike(login.getName(), login.getPassword());
		System.out.println(login.getName());
		if (id > 0l) {
			return true;
		} else
			LOGGER.error("Login failed{}", java.time.LocalDate.now());
			return false;
	}
}
