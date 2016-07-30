package com.fisherpaykel.entity;

public class InputForm {
	private String name;
	private String email;
	private String address;
	private String applicationID;
	
	public InputForm(String name, String email, String address, String applicationID) {
		super();
		this.name = name;
		this.email = email;
		this.address = address;
		this.applicationID = applicationID;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getApplicationID() {
		return applicationID;
	}
	public void setApplicationID(String applicationID) {
		this.applicationID = applicationID;
	}
}
