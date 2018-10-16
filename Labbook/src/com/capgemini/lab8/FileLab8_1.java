package com.capgemini.lab8;

public class FileLab8_1 {
	public static void main(String[] args) {
		
	
	CopyDataThread c1=new CopyDataThread();
	Thread t1 =new Thread(c1);
	t1.start();
	
	}
}
