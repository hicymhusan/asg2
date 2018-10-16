package com.capgemini.lab6;
import java.util.Scanner;
//6.2: Validate the age of a person in Lab assignment 4.2 and display proper message by using user defined exception. Age of a person should be above 15.
public class PersonAge6_2 {
	String name;
	float age;
	
	
	public PersonAge6_2(String name, float age) throws InvalidAgeException  {
		super();
		if (age<=15)
		{
			throw new InvalidAgeException();
		}
		else
			
		{
		this.age=age;
		this.name=name;
		}
		
	}
	public PersonAge6_2() {
		super();// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	
}
	
	
	public static void main(String[] args) throws  InvalidAgeException {
		System.out.println("Enter name and age of person");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		float age=sc.nextFloat();
		PersonAge6_2 per=new PersonAge6_2(name,age);
		System.out.println(per);
		sc.close();
	}
	
}