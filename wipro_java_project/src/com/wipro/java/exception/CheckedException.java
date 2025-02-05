package com.wipro.java.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
//FileInputStream tries to open a file.
public class CheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file = new File("exception.txt");
			FileInputStream inputstream = new FileInputStream(file);
		}
		catch(IOException e) {
			System.out.println(e.getStackTrace());
		}
	}

}
