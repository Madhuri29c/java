package com.wipro.java.oops.inheritance;

import java.io.ObjectInputStream.GetField;

/*
 * Parent class = Employee
 * Child class = Developer
 * Extends = Keyword
 * child object is instantiated from child constructor
 * parent class consumes the properties and behaviors of child class 
 */
public class Developer extends Employee {

	public Developer() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String a[]) {
		Employee developer=new Developer();
		developer.setEmpid(2468);
		developer.setName("Hema");
		developer.setSalary(350000f);
		developer.setCompanyName("Accenture");
		
		System.out.println(developer.getEmpid());
		System.out.println(developer.getName());
		System.out.println(developer.getSalary());
		System.out.println(developer.getCompanyName());
	}

}

