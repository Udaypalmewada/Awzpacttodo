package com.todo.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todo.boot.entity.Address;

public interface IAddressRepository extends JpaRepository<Address,Integer > {

}
