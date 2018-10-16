package com.capgemini.lab3;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

//3.6: Create a method which accept zone id and print the current date and time with respect to given zone. (Hint: Few zones to test your code. America/New_York, Europe/London, Asia/Tokyo, US/Pacific, Africa/Cairo, Australia/Sydney etc.)
public class ZoneIdTime3_6 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
	 	 System.out.println("Enter Zone id((Hint: Few zones to test your code. America/New_York, Europe/London, Asia/Tokyo, US/Pacific, Africa/Cairo, Australia/Sydney etc.)");

			String zoneId=sc.nextLine();
			calTimeDate(zoneId);
	sc.close();
	}
public static void calTimeDate(String zone)
{
	ZoneId zoneId=ZoneId.of(zone);
	ZonedDateTime currentDateTime=ZonedDateTime.now(zoneId);
	
	System.out.println(currentDateTime);
}

}
