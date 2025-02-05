package com.wipro.java.exception;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[]= {1,2,3};
			System.out.println(a[5]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception caught: " + e.toString());
		}
		finally {
			System.out.println("Here I am executed");
		}
		System.out.println("Have a look");
	}

}
