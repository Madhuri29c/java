package com.wipro.java.oops.polymorphism;

public class Audi extends Car {
	public void showCarInfo() {
		System.out.println("This is a Audi: " + getCompany() + " Car Name: " + getName() + " Mileage: " + getMileage());

	}
		public static void main(String args[]) {
			Car audi = new Audi();
			audi.setCompany("Audi AG");//This is company
			audi.setName("Audi Q7");//This is car name
			audi.setMileage(110);//This is car mileage
			audi.showCarInfo();
		}

}
