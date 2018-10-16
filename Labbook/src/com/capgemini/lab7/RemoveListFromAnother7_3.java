package com.capgemini.lab7;

import java.util.ArrayList;
import java.util.List;

public class RemoveListFromAnother7_3 {
	public static void main(String[] args) {
		RemoveListFromAnother7_3 rem=new RemoveListFromAnother7_3();
	List list1=new ArrayList();
	List list2=new ArrayList();
	
	list1.add("a");
	list1.add("b");
	list1.add("c");
	list1.add("d");
	
	System.out.println("List1: "+list1);
	
	list2.add("b");
	list2.add("c");
	list2.add("d");
	
	System.out.println("List2: "+list2);

List result=removeElements(list1,list2);
System.out.println("Removed list2 from list1:"+result);

}
	public static List<String> removeElements(List<String> list1, List<String> list2)
	{
		list1.removeAll(list2);
		return list1;
	}
}