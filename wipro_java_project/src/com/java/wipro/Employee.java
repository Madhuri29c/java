/**
 * 
 */
package com.java.wipro;

/**
 * 
 */
public class Employee {

	private String name;//This is employee name
	private float salary;//This is employee salary
	private String companyName;//This is employee company name
	private int account_no;//This is employee account number
	
	/**
	 * @return
	 * POJO(Plain old java object)
	 */
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
	public int getAccount_no() {
		return account_no;
	}
	public void setAccount_no(int account_no) {
		this.account_no = account_no;
	}
	
}
