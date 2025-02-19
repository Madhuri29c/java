package com.wipro.java.linkedlist;

//LinkedList class (handles insertion, deletion, and display)
class LinkedList {
    private Node head;
    

    // Insert a new user at the end
    public void insert(int id, String name, String company) {
        Node newNode = new Node(id, name, company);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println("User Added: " + name);
    }

    // Delete a user by ID
    public void delete(int id) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        if (head.id == id) {
            head = head.next;
            System.out.println("Deleted User with ID: " + id);
            return;
        }

        Node temp = head, prev = null;
        while (temp != null && temp.id != id) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("User with ID " + id + " not found!");
            return;
        }

        prev.next = temp.next;
        System.out.println("Deleted User with ID: " + id);
    }

    // Display all users
    public void display() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        System.out.println("\n--- Linked List Users ---");
        Node temp = head;
        while (temp != null) {
            System.out.println("ID: " + temp.id + ", Name: " + temp.name + ", Company: " + temp.company);
            temp = temp.next;
        }
    }

    // Search user by ID
    public void search(int id) {
        Node temp = head;
        while (temp != null) {
            if (temp.id == id) {
                System.out.println("User Found: ID = " + temp.id + ", Name = " + temp.name + ", Company = " + temp.company);
                return;
            }
            temp = temp.next;
        }
        System.out.println("User with ID " + id + " not found!");
    }
    public void updateCompany(int id, String newCompany) {
        Node temp = head;
        while (temp != null) {
            if (temp.id == id) {
                temp.company = newCompany;
                System.out.println("Updated Company Name for ID " + id + " to: " + newCompany);
                return;
            }
            temp = temp.next;
        }
        System.out.println("User with ID " + id + " not found!");
    }
}