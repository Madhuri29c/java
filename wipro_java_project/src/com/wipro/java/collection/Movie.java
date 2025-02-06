package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;

//Movie class implements Comparable
//interface to define default sorting
 class Movie implements Comparable<Movie> {
	
	private String n;//Movie name
	 private double r;//Movie rating
	 private int y;//Movie year
	 public Movie(String n,double r,int y) {
		 this.n=n;
		 this.r=r;
		 this.y=y;
	 }
	 @Override
	 //Implemetation of the compareTo method
	 //for default sorting by rating
	 public int compareTo(Movie m) {
	     return Double.compare(this.r, m.r);
	 }
	 //setter method
	 public String getName() {
		 return n;
	 }
	 public double getRating() {
		 return r;
	 }
	 public int getYear() {
		 return y;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method 
		//creating a list of movies
		ArrayList<Movie> l=new ArrayList<>();
		l.add(new Movie("Bahubali",9.6,2016));
		l.add(new Movie("Avengers",8.9,2014));
		l.add(new Movie("Pushpa",9.5,2024));
		//sort movies using Comparables
		//comparableTo method by year
		Collections.sort(l);
		//display the sorted list of movies
		System.out.println("Movies after sorting bt rating");
		for(Movie m : l) {
			System.out.println(m.getName()+" "+m.getRating()+ " "+m.getYear());
		}

	}

}
