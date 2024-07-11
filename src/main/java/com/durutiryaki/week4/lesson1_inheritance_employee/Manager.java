package com.durutiryaki.week4.lesson1_inheritance_employee;

public class Manager extends Employee  {
    // name, id, department alanı atadan miras yoluyla alınır.
    private int teamSize;

    public Manager(){
        // default constructor.
    }

    public Manager(String name, int id, String department, String task, int teamSize) {
        super(name, id, department, task);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("YÖNETİCİ - Yönetilen Kişi Sayısı: " + this.teamSize);
    }

    @Override
    public void performTask() {
        super.performTask();
        System.out.println("Managing people size: " + teamSize);
    }
}
