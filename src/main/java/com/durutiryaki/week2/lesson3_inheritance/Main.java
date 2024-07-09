package com.durutiryaki.week2.lesson3_inheritance;

import java.security.spec.RSAOtherPrimeInfo;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Genel Bir hayvan. ", 3);
        animal.displayDetails();
        animal.makeSound();
        System.out.println();

        Bird bird = new Bird("Deniz", 2, true);
        bird.displayDetails();
        bird.makeSound();
        System.out.println();

        Fish fish = new Fish("Hamsi", 1, true );
        fish.displayDetails();
        fish.makeSound();
        System.out.println();
        /*
        Fish fish = new Fish("Goldfish", 1, false);
        fish.displayDetails();
        fish.makeSound();
        System.out.println();
        Mammal mammal = new Mammal("Lion", 4, true);
        mammal.displayDetails();
        mammal.makeSound();*/
    }
}

