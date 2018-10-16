package com.capgemini.lab7;

import java.util.ArrayList;
import java.util.List;

public class StringOperation7_2 {
	public static void main(String[] args) {
		
		StringOperation7_2 so=new StringOperation7_2();
		String s1=new String("abcabde");
		String s2=new String("ab");
		List result=new ArrayList();
		
		result.add(so.replaceString(s1,s2));
		result.add(so.removeLast(s1,s2));
		result.add(so.removeFirst(s1,s2));
		result.add(so.stringDivide(s1,s2));
		result.add(so.stringReplace(s1,s2));
		for(Object o:result)
			System.out.println(o);
		
		
	}

	public String replaceString(String s1, String s2) {
		String r="";
		for(int i=0;i<s1.length();i++)
			{
			char ch=s1.charAt(i);
			if(i%2==0)
			r=r+ch;
			else
				r=r+s2;
			
			
		}
		return r;
		
	}
	private String removeLast(String s1, String s2) {
		StringBuilder strb=new StringBuilder(s1);
		StringBuilder strb1=new StringBuilder(s2);
		int lindex=strb.lastIndexOf(s2);
		int index=strb.indexOf(s2);
		int count=0;
		int lIndex=0;
		
		while(index!=-1) {
			index=s1.indexOf(s2,index);
			if(index!=-1)
			{
				count++;
				index+=s2.length();
			}
		}
		if(count>1)
		{
			String s=strb1.reverse().toString();
			strb.replace(lindex, s2.length()+lindex, s);
			return strb.toString();
		}
		else
		return s1+s2;
	}
	public String removeFirst(String s1,String s2)
	{
		int fIndex=s1.indexOf(s2);
		StringBuilder strb=new StringBuilder(s1);
		int index=strb.indexOf(s2);
		int count=0;
		int lIndex=0;
		

		while(index!=-1) {
			index=s1.indexOf(s2,index);
			if(index!=-1)
			{
				count++;
				index+=s2.length();
			}
		}
		if(count>1)
		{
			s1=s1.substring(0,fIndex)+s1.substring(fIndex+s2.length());
			return s1;
		}
		else
		return s1;
		
	}
	public String stringDivide(String s1,String s2)
	{
		int mid;
		if((s2.length())%2==0)
		mid=s2.length()/2;
		else
		mid=(s2.length()/2)+1;
		
		s1=s2.substring(0,mid)+s1+s2.substring(mid,s2.length());
		return s1;
	}
	public String stringReplace(String s1,String s2)
	{
		
		return s1.replaceAll(s2, "*");
	}

}
