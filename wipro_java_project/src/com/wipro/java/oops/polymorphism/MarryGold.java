package com.wipro.java.oops.polymorphism;

class MarryGold extends Flower {
    @Override
    public void flowerInfo() {
    	System.out.println("name:"+getName());
    	System.out.println("name:"+getColor());
    }

    public static void main(String[] args) {
        MarryGold myFlower = new MarryGold();
        myFlower.setName("Jasmine"); // Output: The Marigold color is yellow or orange
        myFlower.setColor("White");
        myFlower.flowerInfo();
    }
}


