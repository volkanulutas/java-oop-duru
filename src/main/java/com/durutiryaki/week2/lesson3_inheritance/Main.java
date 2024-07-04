package com.durutiryaki.week2.lesson3_inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal", 5);
        animal.displayDetails();
        animal.makeSound();
        System.out.println();
        Bird bird = new Bird("Parrot", 2, true);
        bird.displayDetails();
        bird.makeSound();
        System.out.println();
        Fish fish = new Fish("Goldfish", 1, false);
        fish.displayDetails();
        fish.makeSound();
        System.out.println();
        Mammal mammal = new Mammal("Lion", 4, true);
        mammal.displayDetails();
        mammal.makeSound();
    }
}

