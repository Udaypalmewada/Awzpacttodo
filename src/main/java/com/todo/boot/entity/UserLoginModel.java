package com.todo.boot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author UDAY JAVA
 *entity for existing user.
 */
@Table(name = "admin_data")
@Entity
public class UserLoginModel {
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
	private String name;
	private String password;
	
	public UserLoginModel() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
