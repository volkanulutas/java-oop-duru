package com.durutiryaki.week2.lesson3_inheritance;

public class Mammal extends Animal {
    private boolean hasFur;

    public Mammal(String name, int age, boolean hasFur) {
        super(name, age);
        this.hasFur = hasFur;
    }

    public boolean isHasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }

    @Override
    public void makeSound() {
        System.out.println("Roar");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Has Fur: " + (hasFur ? "Yes" : "No"));
    }
}

