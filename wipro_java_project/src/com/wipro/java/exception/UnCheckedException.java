package com.wipro.java.exception;



public class UnCheckedException {
    public static void main(String[] args) {
        String text = null; // Null reference
        try {
            System.out.println(text.length()); // Will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}


