package com.cg.eis.pl;

import com.cg.eis.service.EmployeeService;
//5.1
public class ServiceImplementation implements EmployeeService {

	public String findScheme(Double salary, String designation) {
			String scheme;
			if(salary>5000 && salary<20000 && designation.equalsIgnoreCase("System Associate"))
			{
				scheme="Scheme C";
			return scheme ;
			}
			else if(salary>=20000 && salary<40000 && designation.equalsIgnoreCase("Programmer"))
			{
				scheme="Scheme B";
			return scheme ;
			}
			else if(salary>=40000 && designation.equalsIgnoreCase("Manager"))
			{
				scheme="Scheme A";
			return scheme ;
			}
			else if(salary<5000 && designation.equalsIgnoreCase("Clerk"))
			{
				scheme="No Scheme";
			return scheme ;
			}
			else
				return "No Scheme available" ;
			
		}
	
}
