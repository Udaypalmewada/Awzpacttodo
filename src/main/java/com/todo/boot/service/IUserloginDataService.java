package com.todo.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.todo.boot.entity.UserLoginModel;
import com.todo.boot.repository.IUserLoginRepositry;

@Repository
public class IUserloginDataService {
	@Autowired
	private IUserLoginRepositry userLoginRepositry;

	public boolean checkUserExistance(UserLoginModel login) {
		long id = 0l;
		id = userLoginRepositry.countByNameLikeAndPasswordLike(login.getName(), login.getPassword());
		System.out.println(login.getName());
		if (id > 0l) {
			return true;
		} else
			return false;
	}
}
