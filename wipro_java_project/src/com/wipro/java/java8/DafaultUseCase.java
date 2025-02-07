package com.wipro.java.java8;


interface TestInterface4{
	//default method
	default void show() {
		System.out.println("Default TeatInterface4");
	}
}

interface TestInterface3{
	//default method
	default void show() {
		System.out.println("Default TestInterface3");
	}
}
public class DafaultUseCase implements TestInterface3,TestInterface4 {

	public void show() {
		// use super keyword to call the show
		//method of Testinterface3 interface
		TestInterface3.super.show();
		// use super keyword to call the show
		//method of Testinterface4 interface
		TestInterface4.super.show();
		

	}
	public static void main(String args[]) {
		DafaultUseCase d=new DafaultUseCase();
		d.show();
		
	}

}
