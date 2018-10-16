package com.capgemini.lab3;

import java.util.Scanner;

//3.2: Create a method that accepts a String and checks if it is a positive string. A string is considered a positive string, if on moving from left to right each character in the String comes after the previous characters in the Alphabetical order.For Example: ANT is a positive String (Since T comes after N and N comes after A). The method should return true if the entered string is positive.
public class StringCheck3_2 {
	public static void main(String[] args) {
	StringCheck3_2 s=new StringCheck3_2();
	Scanner sc=new Scanner(System.in);
	String st=sc.next();
	s.stringCheck(st);
	sc.close();
	

}

	private void stringCheck(String st) {
		st.toLowerCase();
		int previous,next;
		boolean flag=true;
		for(int i=0;i<st.length()-1;i++)
		{
			previous=st.charAt(i);
			next=st.charAt(i+1);
			if(previous<next)
			{
				continue;
				
			}
			else
			{
				flag=false;
				break;
			}
		}
		if(flag)
			System.out.println("positive");
		else
			System.out.println("negative");
	}
}
