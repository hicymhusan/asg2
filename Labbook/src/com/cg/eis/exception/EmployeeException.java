package com.cg.eis.exception;
//Lab Book Assignment 6.3
public class EmployeeException extends Exception{

	public String getMessage()
	{
		return "Salary of employee is below 3000";
	}

}
