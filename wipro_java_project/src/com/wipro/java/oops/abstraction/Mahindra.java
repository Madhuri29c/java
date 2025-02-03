package com.wipro.java.oops.abstraction;




//Mahindra class extends Car
public class Mahindra extends Car {
 public void mileage() {
	 System.out.println("Mahindra has mileage 120km/h");
 }
 public void company() {
	 System.out.println("Mahindra has company mahindra & mahindra");
 }
 public void name() {
	 System.out.println("Mahindra has car name Mahindra Scorpio");
 }
 public static void main(String args[]) {
	 Car mahindraobj= new Mahindra();
	 mahindraobj.mileage();
	 mahindraobj.company();
	 mahindraobj.name();
 }
}