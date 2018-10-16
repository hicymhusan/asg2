package com.capgemini.lab9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectToFile9_3 {
	private static final String filepath="D:\\employee.java";
	public static void main(String[] args) {
		
		ObjectToFile9_3 obj=new ObjectToFile9_3();
		Employee employee=new Employee(100,"Abhilasha","Sawnerkar",10000,"Analyst","Scheme A");
		System.out.println("Writing object to a file");
		obj.WriteObjectToFile(employee);
		System.out.println("Reading object from a file");
		obj.ReadObjectFromFile(employee);
			
	}
	
	public void WriteObjectToFile(Object serObj) {
		try {
			FileOutputStream fileOut=new FileOutputStream(filepath);
			ObjectOutputStream objectOut=new ObjectOutputStream(fileOut);
			objectOut.writeObject(serObj);
			objectOut.close();
			System.out.println("The Object was succesfulluy written to a file");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("File not found");
		}
		
	}
	public void ReadObjectFromFile(Object serObj) {
		try {
			FileInputStream fileIn=new FileInputStream(filepath);
			ObjectInputStream objectIn=new ObjectInputStream(fileIn);
			Employee emp=(Employee) objectIn.readObject();
			System.out.println(emp.toString());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("File not found");
		}
		
	}

}
