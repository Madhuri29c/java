package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;

class Animal implements Comparable<Animal>{
	private String n;//Animal Name
	private int a;//Animal age
	

	public Animal(String n,int a) {
		//Sort movies in ascending order
		this.n=n;
		this.a=a;
	}
	public String getName() {
		return n;
	}
	public int getAge() {
		return a;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating a list of movies
				ArrayList<Animal> l=new ArrayList<>();
				l.add(new Animal("Cow",8));
				l.add(new Animal("Dog",10));
				l.add(new Animal("Cat",3));
				//sort movies using Comparables
				//comparableTo method by year
				Collections.sort(l);
				//display the sorted list of movies
				System.out.println("Animala after sorting");
				for(Animal o : l) {
					System.out.println(o.getName()+" "+o.getAge());
				}

	}
	@Override
	public int compareTo(Animal o) {
		// TODO Auto-generated method stub
		return Integer.compare(this.a , o.a);
	}
}
