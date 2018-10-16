package com.capgemini.lab4;

import java.util.Random;
import java.util.Scanner;

public class Account extends Person {
	
	long accNum;
	double balance;
	  Person accHolder;
	  static int c;
	public Account(long accNum, double balance, Person accHolder) {
		super();
		this.accNum = accNum;
		this.balance = balance;
		this.accHolder = accHolder;
	}

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	
	public void deposit(double amount){
		balance+=amount;
	}
	public void withdraw(double amount){
		c=0;
		if(amount>balance)
		{System.out.println("Transaction Denied:Insufficient Balance");
		c=1;
		}
		
		balance-=amount;
		if(balance<500 && balance>=0)
		{System.out.println("balance is below minimum balance");}

		}
	
	
	
	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", balance=" + balance
				+ ", accHolder="+accHolder+"]";
	}
	
	public static void main(String[] args) {
		
		Random r=new Random();
		Account acc1,acc2;
		
		acc1=new Account(Math.abs(r.nextInt()),2000,new Person("Smith",23));
		System.out.println(acc1);
		
		Scanner sc=new Scanner(System.in);
		
	 	 System.out.println("Enter amount to deposit");
			double dep=sc.nextDouble();
		acc1.deposit(dep);
		System.out.println("Depositing " +dep+ " INR to Smith account");
		System.out.println(acc1);
		
		acc2=new Account(Math.abs(r.nextInt()),3000,new Person("Kathy",23));
		System.out.println("\n");
		System.out.println(acc2);
		System.out.println("Enter amount to withdraw");
		double withd=sc.nextDouble();
		System.out.println("Withdrawing "+withd+ " INR from Kathy account");
		acc2.withdraw(withd);
		if(c==0)
		System.out.println(acc2);
		
	sc.close();	
	}
	
	
	
}
