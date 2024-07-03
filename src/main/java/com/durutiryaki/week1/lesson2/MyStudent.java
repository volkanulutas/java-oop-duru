package com.durutiryaki.week1.lesson2;

import java.util.Date;

public class MyStudent {
    // attributes  -- özellikler ve String, int, double,
    // functionality eat() work() sleep() code
    public int id; // 200811050

    public String name;

    public String surname;

    public int grade;

    public float gpu;

    public Date date; // tarih tutar.

    public Date graduationDate;

    public String telephoneNumber; // +90532

    public String email;

    public String password;

    // functionality -- viewDetails.
    public void viewDetails() {
        System.out.println("Öğrenci Adı: " + name + " Öğrencinin Soyadı: " + surname + "Mezuniyet Tarihi: " + graduationDate);
    }
}
