package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class Age implements Comparator<Animal1> {
	public int compare(Animal1 m1,Animal1 m2) {
		return Integer.compare(m2.getA(), m1.getA());
	}

	public static void main(String[] args) {
	//create a list of movies
		ArrayList<Animal1> animals = new ArrayList<>();
		animals.add(new Animal1("Cow",5));
		animals.add(new Animal1("Dog",8));
		animals.add(new Animal1("Cat",10));
		//sort movies by rating and display all
		Collections.sort(animals,new Age());
		System.out.println("Animals sorted by age:");
		for(Animal1 m : animals) {
			System.out.println(m.getA()+" "+m.getN());
		}
		//sort movies by name and display
		

	}
}
