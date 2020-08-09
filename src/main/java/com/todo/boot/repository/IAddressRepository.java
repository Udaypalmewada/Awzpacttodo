package com.todo.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.todo.boot.entity.Address;
import com.todo.boot.entity.RegistrationModel;
@Repository
public interface IAddressRepository extends JpaRepository<Address,Integer > {

	

	public abstract Address findByEmployee(RegistrationModel r);

	public abstract Address findById(int id);

	public abstract Address findByEmployee(int id);
	
}
