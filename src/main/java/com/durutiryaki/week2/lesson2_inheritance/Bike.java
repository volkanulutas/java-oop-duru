package com.durutiryaki.week2.lesson2_inheritance;

public class Bike extends Vehicle {
    private boolean hasCarrier;

    public Bike(String brand, int year, double price, boolean hasCarrier) {
        super(brand, year, price);
        this.hasCarrier = hasCarrier;
    }

    public boolean isHasCarrier() {
        return hasCarrier;
    }

    public void setHasCarrier(boolean hasCarrier) {
        this.hasCarrier = hasCarrier;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Has Carrier: " + (hasCarrier ? "Yes" : "No"));
    }
}

