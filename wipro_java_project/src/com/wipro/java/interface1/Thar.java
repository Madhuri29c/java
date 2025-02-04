package com.wipro.java.interface1;


public class Thar implements Car{
	public void carCompany() {
		System.out.println("Thar");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car benz=new Thar();
		benz.carCompany();
	}

}
