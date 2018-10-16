package com.capgemini.lab3;
import java.util.*;
import java.time.*;

//3.3: Create a method to accept date and print the duration in days, months and years with regards to current system date.
public class AcceptDate3_3 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the date in the format yyyy:mm:dd");
		String date=sc.nextLine();
		String[] words=date.split(":");
		int year=Integer.parseInt(words[0]);
		int month=Integer.parseInt(words[1]);
		int day=Integer.parseInt(words[2]);
		
		
	LocalDate pdate=LocalDate.of(year,month,day);
	LocalDate now=LocalDate.now();
	Period diff=Period.between(pdate,now);
	System.out.printf("Difference is %d days, %d months and %d years old",Math.abs(diff.getDays()),Math.abs(diff.getMonths()),Math.abs(diff.getYears()));
	sc.close();
	
	}
}
