package com.wipro.java.oops.encapsulation;

public class Animal {
	public Animal(String name, String color, int age) {
		super();
		this.name = name;
		this.color = color;
	}
	private String name;
	private String color;
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>0) {
		this.age = age;
		}
		else
			System.out.println("Age should be positive");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public static void main(String a[]) {
		Animal animalobj=new Animal("Tiger","Orange",10);
		System.out.println(animalobj.getName());
		System.out.println(animalobj.getColor());
		System.out.println(animalobj.getAge());
		
		animalobj.setAge(1);
		System.out.println(animalobj.getAge());
		System.out.println(animalobj.getName());
		System.out.println(animalobj.getColor());
		
	}

}
