package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class Rate implements Comparator<Movie1> {
	public int compare(Movie1 m1,Movie1 m2) {
		return Double.compare(m2.getR(), m1.getR());
	}

	public static void main(String[] args) {
	//create a list of movies
		ArrayList<Movie1> m1 = new ArrayList<>();
		m1.add(new Movie1("Bahubali",9.5,2015));
		m1.add(new Movie1("Avengers",8.5,2016));
		m1.add(new Movie1("Magic wonderland",9.6,2017));
		//sort movies by rating and display all
		Collections.sort(m1,new Rate());
		System.out.println("Movies sorted by rating:");
		for(Movie1 m : m1) {
			System.out.println(m.getR()+" "+m.getN()+" "+m.getY());
		}
		//sort movies by name and display
		

	}

}
