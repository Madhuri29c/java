/**
 * 
 */
package com.wipro.java.oops;

/**
 * POJO(Plain old Java object)
 * NO constructor
*Getters have return value
* setters have no return value
* properties are determined using private fileds
* values are behaviors are determined through setters
* toString will convert the entire animal class with properties and behaviors
 */
public class Animal {

	private String name;//This is Animal name
	private String type;//This is wild or domestic
	private String color;//This is Animal color
	
	@Override
	public String toString() {
		return "Animal [name=" + name + ", type=" + type + ", color=" + color + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = "Fish";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = "Aquatic";
	}
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = "Blue";
	}

	 
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
