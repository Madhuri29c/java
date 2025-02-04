package com.wipro.java.oops.polymorphism;

class MarryGold extends Flower {
    @Override
    public void flowerColor() {
        System.out.println("The Marigold color is yellow or orange");
    }
    public void flowerSize() {
    	System.out.println("The Marigold size is medium");
    }


    public static void main(String[] args) {
        MarryGold myFlower = new MarryGold();
        myFlower.flowerColor(); // Output: The Marigold color is yellow or orange
        myFlower.flowerSize();
    }
}


