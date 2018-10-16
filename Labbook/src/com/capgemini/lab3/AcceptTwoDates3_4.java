package com.capgemini.lab3;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//3.4: Revise exercise 3.3 to accept two LocalDates and print the duration between dates in days, months and years.
public class AcceptTwoDates3_4 {
public static void main(String[] args) {
	
	
	Scanner sc=new Scanner(System.in);
		
		 	 System.out.println("Enter the date in the format yyyy-mm-dd");
				String dt1=sc.nextLine();

			 	 System.out.println("Enter the date in the format yyyy-mm-dd");
					String dt2=sc.nextLine();
					calculatePeriod(dt1,dt2);
	sc.close();
	
	}
public static void calculatePeriod(String str1,String str2)
{
	DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd");
	LocalDate date1=LocalDate.parse(str1, formatter);
	LocalDate date2=LocalDate.parse(str2, formatter);
	
	Period period=date2.until(date1);
	System.out.printf("Days:%d\nMonths:%d\nYears:%d\n",Math.abs(period.getDays()),Math.abs(period.getMonths()),Math.abs(period.getYears()));
	
}


}