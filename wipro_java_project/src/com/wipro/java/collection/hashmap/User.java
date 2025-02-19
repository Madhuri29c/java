package com.wipro.java.collection.hashmap;

class User {
    int id;
    String name;
    String company;

    public User(int id, String name, String company) {
        this.id = id;
        this.name = name;
        this.company = company;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Company: " + company;
    }
}
