package com.wipro.java.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class AllExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=10,num2=0;
		try {
            // This will cause ArithmeticException
            int res = num1 / num2;
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.toString());
        }
		try {//checked exception
			File file = new File("exception.txt");
			FileInputStream inputstream = new FileInputStream(file);
		}
		catch(IOException e) {
			System.out.println(e.getStackTrace());
		}
		try {//unchecked exception
			int a[]= {1,2,3};
			System.out.println(a[5]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception caught:Out of bound " + e.toString());
		}

	}

}
