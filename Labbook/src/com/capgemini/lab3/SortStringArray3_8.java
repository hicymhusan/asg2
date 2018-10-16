package com.capgemini.lab3;

import java.util.Arrays;

/*3.8 : Create a method that can accept an array of String objects and sort in alphabetical order.
The elements in the left half should be completely in uppercase and the elements in the right half
should be completely in lower case. Return the resulting array.
Note: If there are odd number of String objects, then (n/2)+1 elements should be in UPPPERCASE*/
public class SortStringArray3_8 {
	public static void main(String[] args) {
		String aString[]={"purva","vinay","sejal","kalyani"};
		int mid;
		Arrays.sort(aString);
		System.out.println("***Sorted Array***");
		for(String ele:aString)
		{
			System.out.println(ele);
		}
		System.out.println("\n******************************************");
		if((aString.length)%2==0)
		{
			mid=(aString.length/2);
		}
		else
			mid=(aString.length/2)+1;
		for(int i=0;i<mid;i++)
		{
			aString[i]=aString[i].toUpperCase();
			System.out.println(aString[i]);
		}
		for(int i=mid;i<aString.length;i++)
		{
			aString[i]=aString[i].toLowerCase();
			System.out.println(aString[i]);
		}
	}
	

}
