package com.wipro.java.collection.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample {
    private static HashMap<Integer, User> userMap = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    
    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1. Add User\n2. Delete User\n3. Search User\n4. Update Company\n5. Display All Users\n6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    addUser();
                    break;
                case 2:
                    deleteUser();
                    break;
                case 3:
                    searchUser();
                    break;
                case 4:
                    updateCompany();
                    break;
                case 5:
                    displayUsers();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }

    private static void addUser() {
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Company: ");
        String company = scanner.nextLine();

        userMap.put(id, new User(id, name, company));
        System.out.println("User Added Successfully!");
    }

    private static void deleteUser() {
        System.out.print("Enter ID to delete: ");
        int id = scanner.nextInt();
        if (userMap.remove(id) != null) {
            System.out.println("User Deleted Successfully!");
        } else {
            System.out.println("User not found!");
        }
    }

    private static void searchUser() {
        System.out.print("Enter ID to search: ");
        int id = scanner.nextInt();
        User user = userMap.get(id);
        if (user != null) {
            System.out.println("User Found: " + user);
        } else {
            System.out.println("User not found!");
        }
    }

    private static void updateCompany() {
        System.out.print("Enter ID to update company: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        if (userMap.containsKey(id)) {
            System.out.print("Enter New Company: ");
            String newCompany = scanner.nextLine();
            userMap.get(id).company = newCompany;
            System.out.println("Company Updated Successfully!");
        } else {
            System.out.println("User not found!");
        }
    }

    private static void displayUsers() {
        if (userMap.isEmpty()) {
            System.out.println("No users found!");
        } else {
            System.out.println("\n--- User List ---");
            for (User user : userMap.values()) {
                System.out.println(user);
            }
        }
    }
}
