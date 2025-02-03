package com.wipro.java.oops;
public class Flower {
	//properties and behaviours
	//color,smell,size,moisture
	//rose,sweet,medium,medium
	String flowerName;
	String colorValue;

	 Flower(String flower,String color) {
		// TODO Auto-generated constructor stub
		 this.flowerName=flower;
		 this.colorValue=color;
	}

	void display() {
		System.out.println("Flower name:"+flowerName + " Flower color:"+colorValue);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flower flowerobj1=new Flower("Rose","Red");
		Flower flowerobj2=new  Flower("Jasmine","white");
		flowerobj1.display();
		flowerobj2.display();
		

	}
}
