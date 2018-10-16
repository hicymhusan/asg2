package com.capgemini.lab4;

import java.util.Random;
import java.util.Scanner;

public class SavingsAccount extends Account {
	static int c;
private final int minBal=500;

@Override
public void withdraw(double amount){
	c=0;
	if(amount>balance)
	{System.out.println("Transaction Denied:Insufficient Balance");
	
	c=1;}
	balance-=amount;
	if(amount<minBal)
	{System.out.println("balance is below minimum balance");}
	

	}
	
	public SavingsAccount(long accNum, double balance, Person accHolder) {
		super(accNum, balance, accHolder);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Random r=new Random();
	Account acc1;
	Scanner sc=new Scanner(System.in);
		acc1=new SavingsAccount(Math.abs(r.nextInt()),2000,new Person("Smith",22));
		System.out.println(acc1);
		System.out.println("Enter the amount to deposit");
		double dep=sc.nextDouble();
	System.out.println("Depositing "+dep+" INR to Smith account");
	acc1.deposit(dep);
	System.out.println(acc1);
	 System.out.println("Enter the amount to withdraw");
		double withd=sc.nextDouble();
	System.out.println("Withdrawing "+withd+" INR from Smith account");
	acc1.withdraw(withd);
		if(c==0)
		System.out.println(acc1);
		sc.close();
		
		

	}

}
