package com.todo.boot.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.todo.boot.entity.RegistrationModel;

@Repository
public interface IRegistrationRepository extends JpaRepository<RegistrationModel, Integer> {
	@Override
	<S extends RegistrationModel> S save(S entity);

	//long countByNameLikeAndPasswordLike(String name, String password);

	Optional<RegistrationModel> findByNameLike(String name);


}
