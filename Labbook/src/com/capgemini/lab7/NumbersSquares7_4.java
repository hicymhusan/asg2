package com.capgemini.lab7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumbersSquares7_4 {
	public static void main(String[] args) {
		
	
	List no=new ArrayList();
	no.add(1);
	no.add(2);
	no.add(3);
	no.add(4);
	Map result=new HashMap();
	result=square(no);
	System.out.println(result);
	}

	private static Map square(List no) {
		Map hm=new HashMap();
		for(int i=0;i<no.size();i++)
		hm.put(no.get(i),((Integer.parseInt(no.get(i).toString())*(Integer.parseInt(no.get(i).toString())))));
		return  hm;
	}
}
