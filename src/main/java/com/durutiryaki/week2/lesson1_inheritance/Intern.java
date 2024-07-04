package com.durutiryaki.week2.lesson1_inheritance;

public class Intern extends Employee {
    private int workHours;

    public Intern(String name, int id, double baseSalary, int workHours) {
        super(name, id, baseSalary);
        this.workHours = workHours;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    @Override
    public double calculateSalary() {
        // Assuming baseSalary is the salary per hour for interns
        return getBaseSalary() * workHours;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Work Hours: " + workHours);
        System.out.println("Calculated Salary: " + calculateSalary());
    }
}

