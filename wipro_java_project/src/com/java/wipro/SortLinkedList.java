package com.java.wipro;

import java.util.*;

class SortLinkedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        scanner.close();
        
        System.out.println("Original LinkedList: " + list);
        
        // Sorting using Comparator
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return a - b; // Ascending order
            }
        });
        
        System.out.println("Sorted LinkedList: " + list);
    }
}