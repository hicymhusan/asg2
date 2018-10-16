package com.capgemini.lab8;

import java.util.Random;

public class Number8_3 implements Runnable {
int num;

	public Number8_3(int num) {
	super();
	this.num = num;
}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Number is: " +num);
	}
	public static void main(String[] args)throws InterruptedException {
	Number8_3 numth;
	NumberFactorial8_3 fact;
	Thread t1,t2;
	Random r=new Random();
	int num;
	for(int i=0;i<5;i++)
	{
		num=Math.abs(r.nextInt(10));
		numth=new Number8_3(num);
		t1=new Thread(numth);
		t1.start();
		t1.join();
		fact=new NumberFactorial8_3(num);
		t2=new Thread(fact);
		t2.start();
	}
		
	}

}
