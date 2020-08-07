package com.todo.boot.repository;

import org.springframework.stereotype.Repository;
/**
 * UserLoginRepositry.
 * @author UDAY JAVA
 *UserLoginRepositry for admin/user login in to application.
 */
@Repository
public abstract class UserLoginRepositry implements IUserLoginRepositry {
@Override
	public  abstract long countByNameLikeAndPasswordLike(String name, String password);
	
}
