package com.capgemini.lab9;

import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;

public class EvenFile9_2 {
	public static void main(String[] args) {
		try {
			String line="";
			Scanner sc=new Scanner(System.in);
			File file=new File("D:\\numbers.txt");
			sc=new Scanner(file);
			while(sc.hasNextLine())
			{
				line=sc.nextLine();
				if(line!=null)
				{
					StringTokenizer st=new  StringTokenizer(line,",");
					while(st.hasMoreTokens()) {
						int s=Integer.parseInt(st.nextToken());
						if(s%2==0)
						{
							System.out.println(s);
						}
					}
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
