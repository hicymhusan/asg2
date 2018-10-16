package com.capgemini.lab6;

@SuppressWarnings("serial")
public class InvalidException extends Exception {
	public String getMessage()
	{
		return "Invalid username and password";
	}

}
