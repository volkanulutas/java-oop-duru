package com.durutiryaki.week2.lesson2_inheritance;

public class Jet extends Vehicle {
    private int maxSpeed;
    private int range;

    public Jet(String brand, int year, double price, int maxSpeed, int range) {
        super(brand, year, price);
        this.maxSpeed = maxSpeed;
        this.range = range;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Range: " + range + " km");
    }
}

