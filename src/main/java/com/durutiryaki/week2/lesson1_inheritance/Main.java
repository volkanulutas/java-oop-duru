package com.durutiryaki.week2.lesson1_inheritance;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", 101, 50000);
        emp.displayDetails();

        System.out.println();

        Manager mgr = new Manager("Jane Smith", 102, 75000, 20000);
        mgr.displayDetails();
        System.out.println();

        Intern intern = new Intern("Alice Brown", 103, 20, 120); // 20 per hour, 120 hours worked
        intern.displayDetails();
    }
}

