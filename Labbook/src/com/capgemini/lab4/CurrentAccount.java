package com.capgemini.lab4;

import java.util.Random;
import java.util.Scanner;

public class CurrentAccount extends Account {
	private double overdraftLimit;
	static boolean c;

	public CurrentAccount(long accNum, double balance, Person accHolder) {
		super(accNum, balance, accHolder);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void withdraw(double amount){
		c=false;
		overdraftLimit=(balance*10)/100;
		System.out.println("overdraft limit="+overdraftLimit);
		if(Math.abs((balance-amount))>overdraftLimit)
		{
			System.out.println("Cannot withdraw, amount is above overdraft Limit");
			c=true;
		}
		else
		{
			balance-=amount;
			if(balance<0){
				balance=0;
			}
		}

		}
	public static void main(String[] args) {
		Random r=new Random();
	CurrentAccount acc1;
	
		acc1=new CurrentAccount(Math.abs(r.nextInt()),2000,new Person("Smith",22));
		Scanner sc=new Scanner(System.in);
		System.out.println(acc1);
	 	 System.out.println("Enter the amount to deposit");
			double dep=sc.nextDouble();
		System.out.println("Depositing "+dep+" INR to Smith account");
		acc1.deposit(dep);
		System.out.println(acc1);
		 System.out.println("Enter the amount to withdraw");
			double withd=sc.nextDouble();
		System.out.println("Withdrawing " +withd+" INR from Smith account");
		acc1.withdraw(withd);
		if(c==false)
		System.out.println(acc1);
		sc.close();
		
		

	}
	

}
