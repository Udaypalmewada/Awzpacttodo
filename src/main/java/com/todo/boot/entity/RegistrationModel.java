package com.todo.boot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author UDAY JAVA
 *UserEntity/user modelfor user.
 */
@Table(name = "employee")
@Entity
public class RegistrationModel {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="employee_id")
    private int id;
	@Column(name="name")
	private String name;
	@Column(name="phon_number")
	private String number;
	@Column(name="email")
    private String email;
	@Column(name="gender")
    private String gender;
	@Column(name="status")
    private boolean status;
	@Column(name="departmentId")
    private int departmentId;
   
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "RegistrationModel [id=" + id + ", name=" + name + ", number=" + number + ", email=" + email
				+ ", gender=" + gender + ", status=" + status + ", departmentId=" + departmentId + "]";
	}
	
  }
