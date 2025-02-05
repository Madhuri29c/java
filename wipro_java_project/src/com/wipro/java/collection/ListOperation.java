package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.List;

public class ListOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1 = new ArrayList<Integer>();//creating an object of List1
		l1.add(0,1);//position and value
		l1.add(1,2);
		l1.add(2,3);
		l1.add(3,4);
		l1.add(4,5);
		
		System.out.println(l1);
		//Here size and memory is not fixed
		List<Integer> l2 = new ArrayList<Integer>();//creating an object of List2
		l2.add(0);//Here we are not giving position.If we don't give position also it will work fine
		l2.add(1);
		l2.add(2);
		l2.add(3);
		
		l1.addAll(1,l2);//Here adding the elements to l1 from index1
		
		System.out.println(l1);
		//remove the element has index 1 from l1
		l1.remove(1);
		System.out.println(l1);
		//set the element at index 0 from l1
		l1.set(0,5);
		System.out.println(l1);
		
		

	}

}
