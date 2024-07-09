package com.durutiryaki.week1.lesson2;

import java.util.Date;

public class Main2 {
    public static void main(String[] args) {
        MyStudent2 student = new MyStudent2();
        // student.email = "durutiryaki@gmail.com";
        // student.password = "@123Ext01";
        // --
        // System.out.println("eposta: " + student.email + " Şifre: " + student.password);
        // Get nesneden özellikleri okuma, set nesneden özellikleri yazma.
        // getter setter
        student.setEmail("durutiryaki@gmail.com");
        // student.setPassword("@123Ext01");
        // System.out.println(student.getEmail() + " " + student.getPassword());
    }
}
