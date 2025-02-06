package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class Name implements Comparator<Movie1>{
	public int compare(Movie1 m1,Movie1 m2) {
		//sort byname in alphabet order
		return m1.getN().compareTo(m2.getN());
	}

	public static void main(String[] args) {
		// Create a list of movies
		ArrayList<Movie1> m1=new ArrayList<>();
		m1.add(new Movie1("Bahubali",9.5,2015));
		m1.add(new Movie1("Avengers",8.8,2014));
		m1.add(new Movie1("Magic wonderland",9.6,2017));
		
		//sort movies by name and display all
		Collections.sort(m1,new Name());
		System.out.println("\nMovies soretd by name");
		for(Movie1 m:m1) {
			System.out.println(m.getN()+" " + m.getR()+" "+m.getY());
			
		}

	}

}
