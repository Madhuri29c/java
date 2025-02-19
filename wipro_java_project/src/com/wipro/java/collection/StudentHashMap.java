package com.wipro.java.collection;

import java.util.*;

public class StudentHashMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, List<String>> students = new HashMap<>();

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < n; i++) {
            System.out.print("Enter roll number: ");
            int rollNo = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            addStudent(students, rollNo, name);
        }

        // Displaying the student data
        System.out.println("\nStored Student Data:");
        for (Map.Entry<Integer, List<String>> entry : students.entrySet()) {
            System.out.println("Roll Number: " + entry.getKey() + " -> " + entry.getValue());
        }

        scanner.close();
    }

    // Method to add student data
    private static void addStudent(HashMap<Integer, List<String>> students, int rollNo, String name) {
        students.putIfAbsent(rollNo, new ArrayList<>());
        students.get(rollNo).add(name);
    }
}

