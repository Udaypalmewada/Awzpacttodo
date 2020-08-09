package com.todo.boot.request;

/**
 * RegisterRequest.
 * @author UDAY JAVA
 *RegisterRequest is the vo class for RegisterModel class.
 */
public class RegisterRequest {
	private String name;
	private String number;
	private String email;
	private String gender;
	private boolean status;
	private int department;
	private CityRequest city;
	private AddressRequest address;
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
	
	
	public int getDepartment() {
		return department;
	}
	public void setDepartment(int department) {
		this.department = department;
	}
	public CityRequest getCity() {
		return city;
	}
	public void setCity(CityRequest city) {
		this.city = city;
	}
	public AddressRequest getAddress() {
		return address;
	}
	public void setAddress(AddressRequest address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "RegisterRequest [name=" + name + ", number=" + number + ", email=" + email + ", gender=" + gender
				+ ", status=" + status + ", department=" + department + ", city=" + city + ", address=" + address + "]";
	}
	
	

}
