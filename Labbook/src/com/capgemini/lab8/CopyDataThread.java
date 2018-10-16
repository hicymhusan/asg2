package com.capgemini.lab8;

import java.io.*;



//8.1

public class CopyDataThread extends Thread{
	
		//File sourceFile=new File("D:\\Abhilasha\\workspace\\Labbook\\src\\com\\capgemini\\lab2\\Person2_3.java");
		//File destinationFile=new File("D:\\Abhilasha\\Output.txt");
		
		FileInputStream fromFile;
		FileOutputStream toFile;
		public void init(String fFile,String tFile)
		{
			try {
				fromFile=new FileInputStream(fFile);
				toFile=new FileOutputStream(tFile);
				
			}
			catch(FileNotFoundException e)
			{
				e.printStackTrace();
			}
		}
		
	public void copyContents()
	{
		try {
			int i=fromFile.read();
			int count=0;
			while(i!=1)
			{
				toFile.write(i);
				i=fromFile.read();
				count++;
				if(count==10) {
					System.out.println("10 characters are copied");
					count=0;
					
						Thread.sleep(500);
					
				}
			}
			System.out.println("File contents copied successfully");
		}
		catch(IOException e){
			e.printStackTrace();
			
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void closeFile()
	{
		try {
			fromFile.close();
			toFile.close();
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	public void run()
	{
		CopyDataThread c1=new CopyDataThread();
		c1.init("D:\\Abhilasha\\workspace\\Labbook\\src\\com\\capgemini\\lab2\\Person2_3.java", "D:\\Abhilasha\\Output.txt");
		try{
			c1.copyContents();
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
		c1.closeFile();
	}

}