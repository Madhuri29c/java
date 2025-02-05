package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.List;

public class ListOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1 = new ArrayList<Integer>();//creating an object of List
		l1.add(0,1);//position and value
		l1.add(1,2);
		l1.add(2,3);
		l1.add(3,4);
		l1.add(4,5);
		
		System.out.println(l1);
		
		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(0);
		l2.add(1);
		l2.add(2);
		l2.add(3);
		
		l1.addAll(1,l2);
		
		System.out.println(l1);
		
		l1.remove(1);
		System.out.println(l1);
		l1.set(0,5);
		System.out.println(l1);
		
		

	}

}
