package com.wipro.java.collection;

import java.util.LinkedList;
import java.util.List;

class LinkedListExample {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int n=5,i;//Size of linked list is 5
			//Declaring the list with size
			List<Integer> l1= new LinkedList<Integer>();
			//Appending the new elements at the end of the list
			for(i=0;i<n;i++) {
				l1.add(i);//1,2,3,4,5
			}
			System.out.println(l1);//printing the values of l1
			//Remove the element at index 3
			l1.remove(3);
			//After removing printing the elements
			System.out.println(l1);
			for(i=0;i<l1.size();i++) {
				System.out.println(l1.get(i)+" ");
			}
			

		}

	}


