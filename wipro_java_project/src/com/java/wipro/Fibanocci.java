package com.java.wipro;

import java.util.Scanner;
import java.util.TreeMap;


public class Fibanocci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the start range: ");
        int start = scanner.nextInt();
        System.out.print("Enter the end range: ");
        int end = scanner.nextInt();
        scanner.close();

        TreeMap<Integer, Integer> fibonacciMap = generateFibonacciSeries(start, end);
        
        System.out.println("Fibonacci Series in range stored in TreeMap:");
        for (var entry : fibonacciMap.entrySet()) {
            System.out.println("Term " + entry.getKey() + " : " + entry.getValue());
        }
    }

    private static TreeMap<Integer, Integer> generateFibonacciSeries(int start, int end) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int a = 0, b = 1, index = 0;
        while (a <= end) {
            if (a >= start) {
                map.put(index, a);
            }
            int next = a + b;
            a = b;
            b = next;
            index++;
        }
        return map;
    }
}
