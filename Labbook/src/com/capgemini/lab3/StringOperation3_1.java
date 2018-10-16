package com.capgemini.lab3;
import java.util.Scanner;
/*3.1: Create a method which can perform a particular String operation based on the user’s choice. The method should accept the String object and the user’s choice and return the output of the operation.
Options are
Add the String to itself
Replace odd positions with #
Remove duplicate characters in the String
Change odd characters to upper case */


public class StringOperation3_1 {
	//Add the String to itself
	public static void addString(String a)
	{
		String snew=a+a;
		System.out.println(snew);
		
	}
	
	//Replace odd positions with #
	public static void replace(String c)
	{
	for(int i=0; i<c.length();i++)
	{
		if(i%2!=0)
			c=c.substring(0,i-1)+"#"+c.substring(i,c.length());
		
	}
	System.out.println(c);
	}
	
	//Remove duplicate characters in the String
	public static void removeDuplicate(String s)
	{
		char[] chrArray=s.toCharArray();
		String ans="";
		for(char value : chrArray)
		{
			if(ans.indexOf(value)==-1){
				ans+=value;
			}
		}
		System.out.println(ans);
	}
	
	//Change odd characters to upper case 
	public static void changeOdd(String s)
	{
		for(int index=0; index<s.length();index++)
		{
			if(index%2!=0)
			{
				char t=s.charAt(index);
			char x=Character.toUpperCase(t);
				s=s.substring(0,index-1)+x+s.substring(index,s.length());
			}
		}
		System.out.println(s);
		
	}
	
	
	public static void main (String[] args) {

	Scanner console=new Scanner(System.in);
	System.out.println("Enter a String");
	String s=console.nextLine();
console.close();
	int c;

do
{
System.out.println("Select");
System.out.println(" 1.Add the String to itself\n 2.Replace odd positions with #\n 3.Remove duplicate characters in the String\n 4.Change odd characters to upper case\n 5.exit");
 c=console.nextInt();

 	switch(c)
 	{
 	case 1:
	addString(s);
	break;
 	case 2:
	replace(s);
	break;
 	case 3 :
	removeDuplicate(s);
	break;
 	case 4:
	changeOdd(s);
	break;
	
 	}
}while(c!=5);
}
	
}
