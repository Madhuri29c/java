package com.wipro.java.interface1;

public class Benz implements Car{
	public void carCompany() {
		System.out.println("Mercedes");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car benz=new Benz();
		benz.carCompany();
	}

}
