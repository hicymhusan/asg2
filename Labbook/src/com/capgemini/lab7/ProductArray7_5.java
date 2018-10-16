package com.capgemini.lab7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//7.5 program to store product names in anArrayList, sort strings available in an arrayList and display the names using for-each loop.
public class ProductArray7_5 {
	public static void main(String[] args) {
		List product=new ArrayList();
		
		product.add("Mouse");
		product.add("Book");
		product.add("Bottle");
		product.add("Mobile");
		Collections.sort(product);
		System.out.println("Sorted product List: "+product);
		
	}
	

}
