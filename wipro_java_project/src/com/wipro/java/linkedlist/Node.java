package com.wipro.java.linkedlist;

// Node class (represents a user)
class Node {
    int id;
    String name;
    String company;
    Node next;

    public Node(int id, String name, String company) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.next = null;
    }
}