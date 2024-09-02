package com.demo.entity;

public class Employee {

	public int id;
	public String name;
	public int gender;
	public String role;
	
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
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
	public Employee(int id, String name, int gender, String role) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.role = role;
	}
	
	public Employee() {
		super();
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", role=" + role + "]";
	}
	
	
}
