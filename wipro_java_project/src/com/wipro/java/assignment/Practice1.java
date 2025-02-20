package com.wipro.java.assignment;

import java.util.LinkedList;
import java.util.Scanner;

// Write your logic here:
class Stack<T> {
    private LinkedList<T> list;

    // Constructor
    public Stack() {
        list = new LinkedList<>();
    }

    // Push method to add an item to the top of the stack
    public void push(T item) {
        list.addFirst(item); // Adds item to the front (top) of the list
    }

    // Pop method to remove and return the item from the top of the stack
    public T pop() {
        if (isEmpty()) {
            return null; // If the stack is empty, return null
        }
        return list.removeFirst(); // Removes and returns the first item (top of the stack)
    }

    // Peek method to return the item from the top of the stack without removing it
    public T peek() {
        if (isEmpty()) {
            return null; // If the stack is empty, return null
        }
        return list.getFirst(); // Returns the first item (top of the stack) without removing it
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return list.isEmpty(); // Checks if the list is empty
    }
}

// non editable starts here
public class Practice1 {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();

        Scanner scanner = new Scanner(System.in);

        // Input integers until a non-integer is entered
        while (scanner.hasNextInt()) {
            int userInput = scanner.nextInt();
            integerStack.push(userInput);
        }

        // Output stack operations for integers
        System.out.println("Peek: " + integerStack.peek());
        System.out.println("Pop: " + integerStack.pop());
        System.out.println("Is Empty: " + integerStack.isEmpty());
        System.out.println("Pop: " + integerStack.pop());
        System.out.println("Pop: " + integerStack.pop());
        System.out.println("Is Empty: " + integerStack.isEmpty());

        Stack<String> stringStack = new Stack<>();
        scanner.nextLine(); // To clear the buffer after integer input

        // Input strings until an empty string is entered
        while (scanner.hasNextLine()) {
            String userInput = scanner.nextLine();
            if (userInput.isEmpty()) {
                break; // Stop if the user enters an empty string
            }
            stringStack.push(userInput);
        }

        // Output stack operations for strings
        System.out.println("Peek: " + stringStack.peek());
        scanner.close();
    }
}
// non editable ends here