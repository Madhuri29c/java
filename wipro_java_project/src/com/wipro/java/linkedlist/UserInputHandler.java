package com.wipro.java.linkedlist;

import java.util.Scanner;

class UserInputHandler {
    private Scanner scanner;

    public UserInputHandler() {
        scanner = new Scanner(System.in);
    }

    public int getChoice() {
        System.out.println("\n1. Insert User\n2. Delete User\n3. Display Users\n4. Search User\n5. Update Company\n6. Exit");
        System.out.print("Choose an option: ");
        
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Please enter a valid integer.");
            scanner.next(); // Clear the invalid input
        }
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline
        return choice;
    }

    public int getIdInput() {
        System.out.print("Enter User ID: ");
        
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Please enter a valid integer.");
            scanner.next(); // Clear the invalid input
        }
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline
        return id;
    }
    

    public String getStringInput(String message) {
        System.out.print(message);
        return scanner.nextLine().trim(); // Trim removes unnecessary spaces
    }

    public void closeScanner() {
        scanner.close();
    }
}
