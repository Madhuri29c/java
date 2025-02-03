package com.wipro.java.oops.polymorphism;

public class Car {
	private String name;
	private String company;
	private int mileage;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	public void showCarInfo() {
		System.out.println("Car Name:"+name+" Car company:"+company+"car mileage:"+mileage);
	}
}
