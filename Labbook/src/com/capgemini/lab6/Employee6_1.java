package com.capgemini.lab6;

public class Employee6_1 {
	
	private String firstName;
	private String lastName;
	private char gender;
	public Employee6_1() {
		
	}
	public Employee6_1(String firstName, String lastName, char gender) throws InvalidException {
		super();
		if(firstName.equals(" ")|| lastName.equals(" "))
			throw new InvalidException();
		else
		{
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		}
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}

}
