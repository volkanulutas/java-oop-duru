package com.durutiryaki.week2.lesson3_inheritance;

public class Fish extends Animal {
    private boolean isSaltwater;

    public Fish(String name, int age, boolean isSaltwater) {
        super(name, age);
        this.isSaltwater = isSaltwater;
    }



    @Override
    public void makeSound() {
        System.out.println("Blub blub");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Saltwater Fish: " + (isSaltwater ? "Yes" : "No"));
    }
}

