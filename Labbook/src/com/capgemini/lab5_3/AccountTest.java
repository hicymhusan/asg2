package com.capgemini.lab5_3;
//5.3: Refer the problem statement 4.1. Modify account class as abstract class and declare withdraw method.
import java.util.Random;
import java.util.Scanner;


public class AccountTest extends Account {
	
	long accNum;
	double balance;
	  static int c;
	public AccountTest(long accNum, double balance) {
		super();
		this.accNum = accNum;
		this.balance = balance;
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
	
	public void deposit(double amount){
		balance+=amount;
	}
	@Override
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
		return "Account [accNum=" + accNum + ", balance=" + balance+"]";
	}
	
	public static void main(String[] args) {
		
		Random r=new Random();
		AccountTest acc1,acc2;
		
		acc1=new AccountTest(Math.abs(r.nextInt()),2000);
		System.out.println(acc1);
		
		Scanner sc=new Scanner(System.in);
		
	 	 System.out.println("Enter amount to deposit");
			double dep=sc.nextDouble();
		acc1.deposit(dep);
		System.out.println("Depositing " +dep+ " INR to account");
		System.out.println(acc1);
		
		acc2=new AccountTest(Math.abs(r.nextInt()),3000);
		System.out.println("\n");
		System.out.println(acc2);
		System.out.println("Enter amount to withdraw");
		double withd=sc.nextDouble();
		System.out.println("Withdrawing "+withd+ " INR from account");
		acc2.withdraw(withd);
		if(c==0)
		System.out.println(acc2);
		
	sc.close();	
	}
	
}
