package com.wipro.java.oops.polymorphism;

public class Benz extends Car {
    @Override
    public void showCarInfo() {
        System.out.println("This is a Benz: " + getCompany() + " Car Name: " + getName() + " Mileage: " + getMileage());
    }

    public static void main(String args[]) {
        Car benz = new Benz(); // Use Benz reference
        benz.setCompany("Mercedes-Benz Group");//This is Company name
        benz.setName("Gle");//This is car name
        benz.setMileage(120);
        benz.showCarInfo();
    }
}

