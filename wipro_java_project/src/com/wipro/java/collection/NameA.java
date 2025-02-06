package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class NameA implements Comparator<Animal1>{
	public int compare(Animal1 m1,Animal1 m2) {
		//sort byname in alphabet order
		return m1.getN().compareTo(m2.getN());
	}

	public static void main(String[] args) {
		// Create a list of movies
		ArrayList<Animal1> m1=new ArrayList<>();
		m1.add(new Animal1("Cow",10));
		m1.add(new Animal1("Dog",5));
		m1.add(new Animal1("Cat",3));
		
		
		//sort movies by name and display all
		Collections.sort(m1,new NameA());
		System.out.println("\nAnimals soretd by name");
		for(Animal1 m:m1) {
			System.out.println(m.getN()+" " + m.getA());
			
		}

	}
}
