package com.durutiryaki.week6.week6_toString;

public class Main {
    public static void main(String[] args) {
        Plant plant = new Plant("Green", 1, false);
        System.out.println(plant.toString());
        Flower flower = new Flower("Brown", 10, true);
        System.out.println(flower.toString());
        Rose rose = new Rose("Red", 0, false, true);
        System.out.println(rose.toString());
        Orchide orchide = new Orchide("White", 1, true, 10);
        System.out.println(orchide.toString());
    }
}
