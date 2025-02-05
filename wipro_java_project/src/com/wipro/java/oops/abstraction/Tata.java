package com.wipro.java.oops.abstraction;

public class Tata extends Car {
	public void mileage() {
		 System.out.println("Tata has mileage 140km/h");
	 }
	 public void company() {
		 System.out.println("Tata has company Tata motors");
	 }
	 public void name() {
		 System.out.println("Tata has car name Tata nexcon");
	 }
	 public static void main(String args[]) {
		 Car tataobj= new Tata();
		 tataobj.mileage();
		 tataobj.company();
		 tataobj.name();
	 }
	}

