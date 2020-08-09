package com.todo.boot.repository;

import java.util.Optional;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Repository;
import com.todo.boot.entity.RegistrationModel;

/**
 * Registrationrepositry.
 * @author UDAY JAVA
 * is  Repository calss for ragister new employee.
 */
@Repository
public abstract class Registrationrepositry implements IRegistrationRepository {

@Override
public abstract Optional<RegistrationModel> findByNameLike(String name);
abstract Page<RegistrationModel> findAll(Pageable pageRequest);	

}
