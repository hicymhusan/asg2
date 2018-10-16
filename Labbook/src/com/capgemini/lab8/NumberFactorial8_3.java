package com.capgemini.lab8;

public class NumberFactorial8_3 implements Runnable {
	int num;
	 public NumberFactorial8_3(int num) {
		this.num=num;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial is: "+fact);
	}

}
