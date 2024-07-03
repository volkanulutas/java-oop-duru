package com.durutiryaki.week1.lesson2;

import java.util.Date;

public class MyStudent2 {
    // attributes  -- özellikler ve String, int, double,
    // functionality eat() work() sleep() code
    private int id; // 200811050

    private String name;

    private String surname;

    private int grade;

    private float gpu;

    private Date date; // tarih tutar.

    private Date graduationDate;

    private String telephoneNumber; // +90532

    private String email;

    private String password;

    // functionality -- viewDetails.
    public void viewDetails() {
        System.out.println("Öğrenci Adı: " + name + " Öğrencinin Soyadı: " + surname + "Mezuniyet Tarihi: " + graduationDate);
    }

    // alt + insert = generating getter and setter shortcut menu.
    // getter, setter.
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public float getGpu() {
        return gpu;
    }

    public void setGpu(float gpu) {
        this.gpu = gpu;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(Date graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
