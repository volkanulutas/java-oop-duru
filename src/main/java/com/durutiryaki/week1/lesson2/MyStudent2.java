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
