package com.durutiryaki.week2.lesson2_inheritance;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Generic Brand", 2020, 20000);
        vehicle.displayDetails();
        System.out.println();
        Car car = new Car("Toyota", 2022, 30000, 4);
        car.displayDetails();
        System.out.println();
        Bike bike = new Bike("Yamaha", 2021, 15000, true);
        bike.displayDetails();
        System.out.println();
        Ship ship = new Ship("Maersk", 2018, 5000000, 100000, true);
        ship.displayDetails();
        System.out.println();
        Jet jet = new Jet("Gulfstream", 2020, 45000000, 900, 12000);
        jet.displayDetails();
    }
}
