package com.wipro.java.oops.inheritance;

/*
 * Parent class = Employee
 * Child class = Manager
 * Extends = Keyword
 * child object is instantiated from child constructor
 * parent class consumes the properties and behaviors of child class 
 */


public class Manager extends Employee {

	public Manager() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String a[]) {
		Employee manager=new Manager();
		manager.setEmpid(3579);
		manager.setName("Sai");
		manager.setSalary(40000f);
		manager.setCompanyName("Capgemini");
		
		System.out.println(manager.getEmpid());
		System.out.println(manager.getName());
		System.out.println(manager.getSalary());
		System.out.println(manager.getCompanyName());
	}

}
