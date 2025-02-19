package com.wipro.java.linkedlist;

public class LinkedListApp {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        UserInputHandler inputHandler = new UserInputHandler();

        while (true) {
            int choice = inputHandler.getChoice();

            if (choice == 1) {
                int id = inputHandler.getIdInput();
                String name = inputHandler.getStringInput("Enter Name: ");
                String company = inputHandler.getStringInput("Enter Company: ");
                list.insert(id, name, company);
            } 
            else if (choice == 2) {
                int id = inputHandler.getIdInput();
                list.delete(id);
            } 
            else if (choice == 3) {
                list.display();
            } 
            else if (choice == 4) {
                int id = inputHandler.getIdInput();
                list.search(id);
            } 
            else if (choice == 5) {
                System.out.println("Exiting...");
                inputHandler.closeScanner();
                break;
            } 
            else {
                System.out.println("Invalid choice! Try again.");
            }
        }
    }
}