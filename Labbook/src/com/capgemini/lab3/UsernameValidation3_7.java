package com.capgemini.lab3;
import java.util.Scanner;
/*3.7 : You are asked to create an application for registering the details of jobseeker. The
requirement is:
Username should always end with _job and there should be atleast minimum of 8 characters to the left
of _job. Write a function to validate the same. Return true in case the validation is passed. In case of
validation failure return false.*/
public class UsernameValidation3_7 {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	
	String username=sc.nextLine();
	new UsernameValidation3_7().validate(username);
	sc.close();

}
	void validate(String un)
	{
		int x=un.length();
		if(un.length()>=8 && un.charAt(x-1)=='b'&& un.charAt(x-2)=='o' && un.charAt(x-3)=='j' && un.charAt(x-4)=='_')
		{
		 System.out.println("Validation passed");	
		}
		else
			System.out.println("False Validation failed");
	}
}
