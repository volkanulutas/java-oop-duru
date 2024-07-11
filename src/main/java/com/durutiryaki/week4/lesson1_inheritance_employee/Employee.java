package com.durutiryaki.week4.lesson1_inheritance_employee;

public class Employee {
    // attributes
    private String name;
    private int id;
    private String department;
    private String task;

    // constructor (no parameter, or lots of parameters.
    public Employee() {
        // default constructor.
    }

    public Employee(String name, int id, String department, String task) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.task = task;
    }
    // getter setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    // functionality

    public void introduce(){
        System.out.println("ÇALIŞAN TANIT: ");
        System.out.println("-----------------");
        System.out.println("İsim: " + this.getName() +" Sicil No: " + this.getId() +" Bölüm : " + this.getDepartment());
        System.out.println("-----------------\n");
    }

    public void performTask() {
        System.out.println(this.getName() + " performs " + this.getTask() + ".");
    }


}

