package com.wipro.java.java8;

interface TestInterface {
    // Abstract method
    public void circle(int n);

    // Default method
    default String show(int n) {
        return "Default Method Executed  ";
        //return "1";
    }

    // Default method
    default String circle1(int n) {
        return "Default Circle Method Executed" ;
    }

    // Static method
    static String show() {
        return "Static Method Executed";
    }

    // Static method
    static String show1() {
        return "Static Method Executed";
    }
    default double calculateCircumference(int radius) {
        return 2 * 3.14 * radius;
    }
}

public class Shape implements TestInterface {
    public void circle(int n) {
        System.out.println("Circle Area: " + (3.14 * n * n));
    }

    public static void main(String[] args) {
        Shape shape = new Shape();
        
        // Abstract method
        shape.circle(4);
        shape.show(4);
        shape.calculateCircumference(2);
        
        // Default methods
       System.out.println(shape.show(4));
        System.out.println(shape.circle1(5));
        System.out.println("Circumference:"+shape.calculateCircumference(2));
        // Static methods (called using interface name)
        System.out.println(TestInterface.show());
        System.out.println(TestInterface.show1());
    }
}
