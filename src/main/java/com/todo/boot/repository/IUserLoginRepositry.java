package com.todo.boot.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.todo.boot.entity.UserLoginModel;
@Repository
public interface IUserLoginRepositry extends JpaRepository<UserLoginModel, Integer>{
	long countByNameLikeAndPasswordLike(String name, String password);
}
