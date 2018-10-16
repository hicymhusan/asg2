package com.capgemini.lab6;

public class InvalidAgeException extends Exception {
	public String getMessage()
	{
		return "Age of a person should be above 15.";
	}


}
