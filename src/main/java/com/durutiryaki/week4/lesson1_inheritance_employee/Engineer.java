package com.durutiryaki.week4.lesson1_inheritance_employee;

public class Engineer extends Employee {
    private String speciality;

    // contructor with parameter.
    public Engineer(String name, int id, String department,String task, String speciality) {
        super(name, id, department, task);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
    // functionality

    @Override
    public void introduce() {
        // super.introduce();
        System.out.println("ÇALIŞAN (MÜHENDİS) TANIT: ");
        System.out.println("-----------------");
        System.out.println("İsim: "+ super.getName() + " Sicil No: "+ super.getId() + " Bölüm: "+ super.getDepartment() + " Uzmanlık Alanı: "+ this.speciality);

        System.out.println("-----------------\n");
    }

    @Override
    public void performTask() {
        super.performTask();
        System.out.println("Speciality: " + speciality);
    }
}
