package com.wipro.java.oops.inheritance;
/*
 * Parent class = Employee
 * Child class = ProjectLead
 * Extends = Keyword
 * child object is instantiated from child constructor
 * parent class consumes the properties and behaviors of child class 
 */

public class ProjectLead extends Employee {

	public ProjectLead() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String ar[]) {
		Employee employeeobj1=new ProjectLead();
		employeeobj1.setEmpid(1234);
		employeeobj1.setName("Madhuri");
		employeeobj1.setSalary(30000f);
		employeeobj1.setCompanyName("Wipro");
		System.out.println(employeeobj1.getEmpid());
		System.out.println(employeeobj1.getName());
		System.out.println(employeeobj1.getSalary());
		System.out.println(employeeobj1.getCompanyName());
	}

}
