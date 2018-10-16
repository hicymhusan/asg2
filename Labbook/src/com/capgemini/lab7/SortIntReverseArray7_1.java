package com.capgemini.lab7;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//7.1: Create a method which accepts an integer array, reverse the numbers in the array and returns the resulting array in sorted order
public class SortIntReverseArray7_1 {
	public static void main(String[] args)
	{
		int arr[]= {12,23,96,45};
		String  revA[]=new String[4];
		
		System.out.println("Array");
		for(int i=0;i<arr.length;i++)
		System.out.print(" "+arr[i]);
		
		SortIntReverseArray7_1 aRev=new SortIntReverseArray7_1();
		
		System.out.println("\nReverse Array");
		for(int i=0;i<arr.length;i++)
		{
			
			revA[i]=aRev.getReverse(Integer.toString(arr[i]));
			System.out.print(" "+revA[i]);
			
			
		}
		System.out.println("\n\n Sorted Array");
		
		List<String> list=Arrays.asList(revA);
		Collections.sort(list);
		System.out.println(list);
		
		
	}

	
	private String getReverse(String i) {
		StringBuilder sb=new StringBuilder(i);
		return sb.reverse().toString();
		
		
	}
	

}
