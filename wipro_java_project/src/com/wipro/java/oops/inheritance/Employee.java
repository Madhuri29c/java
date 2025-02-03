
/**
 * 
 */
package com.wipro.java.oops.inheritance;

/**
 * POJO Plane old java object thru getter and setter method
 * No constructor
 * getter have return value
 * setter have no return value
 * prop are determine using private fields
 * value are behaviors are determine via setters
 * toString will convert entire animal class with properties and behaviors
 */
public class Employee {

	private String name;//This is employee name
	private float salary;//This is employee salary
	private String companyName;//This is employee company name
	private int empid;//This is employee account number
	private boolean isTaxApplicable;
	
	
	/**
	 * @return
	 * POJO(Plain old java object)
	 */
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public Employee() {
		//TODO Auto-generated constructor stub
	}
	public static void main(String args[]) {
		//TODO Auto-generated constructor stub
	}
	
}
