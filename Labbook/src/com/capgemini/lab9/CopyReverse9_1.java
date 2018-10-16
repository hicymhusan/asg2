package com.capgemini.lab9;

import java.io.*;

public class CopyReverse9_1 {
	public static void main(String[] args) {
		
		try {
			FileReader fr=new FileReader("D:\\Abhilasha\\workspace\\Labbook\\src\\com\\capgemini\\lab2\\Person2_3.java");
			BufferedReader br=new BufferedReader(fr);
			String line="";
			FileWriter fw=new FileWriter("D:\\lab9_1op.txt");
			while(line!=null) {
				line=br.readLine();
				if(line!=null)
				{
					StringBuilder sb= new StringBuilder(line);
					String s=sb.reverse().toString();
					fw.write(s);
					System.out.println(s);
				}
			}
			fr.close();
			fw.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
