package com.capgemini.lab6;




public class EmployeeMain6_1 {
	public static void main(String[] args) throws InvalidException {
		
		Employee6_1 p=new Employee6_1("Abhilasha","Sawnerkar",'F');
		System.out.println("Person Details for valid first and last names");
		System.out.println("----------------");
		System.out.println("First Name: "+p.getFirstName());
		System.out.println("Last Name: "+p.getLastName());
		System.out.println("Gender: "+p.getGender());
		
		
		//for exception
		
Employee6_1 p2=new Employee6_1(" "," ",'F');
System.out.println("Person Details");
System.out.println("----------------");
System.out.println("First Name: "+p2.getFirstName());
System.out.println("Last Name: "+p2.getLastName());
System.out.println("Gender: "+p2.getGender());
	}

}
