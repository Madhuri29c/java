package com.wipro.java.oops.polymorphism;

 class Flower {
	 private String color;
	 private String name;
	 
	 public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void flowerInfo() {
		System.out.println("Name:"+name);
		System.out.println("Color:"+color);
	}
}


