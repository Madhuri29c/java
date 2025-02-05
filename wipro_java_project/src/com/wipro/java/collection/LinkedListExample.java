package com.wipro.java.collection;

import java.util.LinkedList;
import java.util.List;

class LinkedListExample {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int n=5,i;
			List<Integer> l1= new LinkedList<Integer>();
			for(i=0;i<n;i++) {
				l1.add(i);
			}
			System.out.println(l1);
			l1.remove(3);
			System.out.println(l1);
			for(i=0;i<l1.size();i++) {
				System.out.println(l1.get(i)+" ");
			}
			

		}

	}


