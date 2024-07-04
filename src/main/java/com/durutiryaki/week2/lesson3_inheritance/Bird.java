package com.durutiryaki.week2.lesson3_inheritance;

public class Bird extends Animal {
    private boolean canFly;

    public Bird(String name, int age, boolean canFly) {
        super(name, age);
        this.canFly = canFly;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    @Override
    public void makeSound() {
        System.out.println("Chirp chirp");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Can Fly: " + (canFly ? "Yes" : "No"));
    }
}

