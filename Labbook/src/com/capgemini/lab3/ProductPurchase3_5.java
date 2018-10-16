package com.capgemini.lab3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//3.5: Create a method to accept product purchase date and warrantee period (in terms of months and years). Print the date on which warrantee of product expires
public class ProductPurchase3_5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the product purchase date in the format yyyy-mm-dd");
			String pdt=sc.nextLine();
			System.out.println("Enter warrantee period (in terms of months and years). ");
			int wyear=sc.nextInt();
			int wmonth=sc.nextInt();
			calculatePeriod(pdt,wyear,wmonth);
			sc.close();
			
	}
public static void calculatePeriod(String pdate,int wyear,int wmonth)
{
	DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd");
	LocalDate date1=LocalDate.parse(pdate, formatter);
	LocalDate warrdate=date1.plusMonths(wmonth).plusYears(wyear);
	
	System.out.println("Product will expire on:"+warrdate);
	
}
			
			
	

}
