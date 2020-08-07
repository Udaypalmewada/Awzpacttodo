package com.todo.boot.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
/**
 * Entity for Addess.
 * @author UDAY JAVA
 *
 */
@Entity
@Table(name="address")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="addressId")
	private int addressId;
	@OneToOne(cascade= CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="city")
	private City city;
	@OneToOne(cascade= CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="employee")
	private RegistrationModel employee;
	@Column(name="departmentId")
	private int departmentId;
	@Column(name="address")
	private String address;

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public RegistrationModel getEmployee() {
		return employee;
	}

	public void setEmployee(RegistrationModel employee) {
		this.employee = employee;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
   
}
