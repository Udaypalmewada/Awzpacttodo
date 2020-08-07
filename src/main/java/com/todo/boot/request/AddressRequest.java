package com.todo.boot.request;

/**
 * AddressRequest.
 * @author UDAY JAVA
 *AddressRequest is vo object of address class.
 */
public class AddressRequest {
	private CityRequest cityAddress;
	private int department;
	private String address;
	public CityRequest getCityAddress() {
		return cityAddress;
	}
	public void setCityAddress(CityRequest cityAddress) {
		this.cityAddress = cityAddress;
	}
	public int getDepartment() {
		return department;
	}
	public void setDepartment(int department) {
		this.department = department;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
