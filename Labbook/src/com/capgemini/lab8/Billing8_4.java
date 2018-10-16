package com.capgemini.lab8;
 class Customer extends Thread {
@Override
public void run() {
	// TODO Auto-generated method stub
	System.out.println("Customer giving products to billing person");
}	
}
 class Biller extends Thread
 {
	 @Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Billing person bills the product");
	}
 }

public class Billing8_4 {
public static void main(String[] args) {
	for(int i=0;i<5;i++) {
		Customer c=new Customer();
		Thread t1=new Thread(c);
		t1.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Biller b=new Biller();
		Thread t2=new Thread(b);
		t2.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}
