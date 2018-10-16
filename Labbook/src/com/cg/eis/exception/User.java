package com.cg.eis.exception;

import java.util.Scanner;

import com.cg.eis.bean.Employee;
//5.1 com.cg.eis.pl: This package will contain code for getting input from user, produce expected output to the user and invoke services offered by the system.
import com.cg.eis.pl.ServiceImplementation;

public class User {
	public static void main(String[] args) throws EmployeeException {
		Scanner sc=new Scanner(System.in);
		Employee emp= new Employee();
		
		System.out.println("Enter employee id:");
		int id=sc.nextInt();
		emp.setId(id);
		System.out.println("Enter employee name:");
		String name=sc.next();
		String lname=sc.next();
		emp.setLname(lname);
		emp.setName(name);
		System.out.println("Enter employee salary:");
		Double salary=sc.nextDouble();
		if(salary<=3000)
		{
			throw new EmployeeException();
		}
		else
			emp.setSalary(salary);
		
		System.out.println("Enter employee designation:");
		String designation=sc.next();
		emp.setDesignation(designation);
		ServiceImplementation epy=new ServiceImplementation();
		 emp.setInsuranceScheme(epy.findScheme(salary,designation));
		 System.out.println("Insurance Scheme is: "+emp.getInsuranceScheme());
		 
		 System.out.println("Employee Details");
			System.out.println("********************************");
			System.out.println("Employee Id:"+emp.getId()+"\nEmployee name: "+emp.getName()+" "+emp.getLname()+"\nEmployee Salary: "+emp.getSalary()+"\nEmployee Designation: "+emp.getDesignation()+"\nEmployee Insurance Scheme: "+emp.getInsuranceScheme());
		sc.close();
		}
	

}
