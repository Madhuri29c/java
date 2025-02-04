package com.wipro.java.oops.polymorphism;

class MarryGold extends Flower {
    @Override
    public void flowerColor() {
        System.out.println("The Marigold color is yellow or orange");
    }

    public static void main(String[] args) {
        MarryGold myFlower = new MarryGold();
        myFlower.flowerColor(); // Output: The Marigold color is yellow or orange
    }
}


