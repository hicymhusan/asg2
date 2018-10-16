package com.capgemini.lab9;

import java.io.Serializable;

//9.3
public class Employee  implements Serializable{
	private int id;
	private String name;
	private String lname;
	private double salary;
	private String designation;
	private String insuranceScheme;
	public String getLname() {
		return lname;
	}
	
	public Employee(int id, String name, String lname, double salary, String designation, String insuranceScheme) {
		super();
		this.id = id;
		this.name = name;
		this.lname = lname;
		this.salary = salary;
		this.designation = designation;
		this.insuranceScheme = insuranceScheme;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}
	
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getInsuranceScheme() {
		return insuranceScheme;
	}
	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", lname=" + lname + ", salary=" + salary + ", designation="
				+ designation + ", insuranceScheme=" + insuranceScheme + "]";
	}
	
	

}
