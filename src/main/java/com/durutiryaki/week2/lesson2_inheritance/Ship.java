package com.durutiryaki.week2.lesson2_inheritance;

public class Ship extends Vehicle {
    private double tonnage;
    private boolean isCargo;

    public Ship(String brand, int year, double price, double tonnage, boolean isCargo) {
        super(brand, year, price);
        this.tonnage = tonnage;
        this.isCargo = isCargo;
    }

    public double getTonnage() {
        return tonnage;
    }

    public void setTonnage(double tonnage) {
        this.tonnage = tonnage;
    }

    public boolean isCargo() {
        return isCargo;
    }

    public void setCargo(boolean isCargo) {
        this.isCargo = isCargo;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Tonnage: " + tonnage + " tons");
        System.out.println("Is Cargo: " + (isCargo ? "Yes" : "No"));
    }
}

