package com.durutiryaki.week1.lesson2;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyStudent student1 = new MyStudent();
        student1.id = 1;
        student1.name = "Duru";
        student1.surname = "Tiryaki";
        student1.gpu = 90.0F;
        student1.email = "duru@gmail.com";
        student1.password = "12345";
        student1.grade = 1;
        Date date = new Date(System.currentTimeMillis()); // şu anki zamanı verir.
        student1.graduationDate = date;
        student1.telephoneNumber = "+905321112233";
        // ------------------
        int x = 1;
        System.out.println(x);
        // ----
        System.out.println("Öğrencinin Adı: " + student1.name + " Öğrencinin Soyadı: " + student1.surname + " Öğrencinin mezuniyet tarihi: "  + student1.graduationDate);

        //---
        System.out.println("-----");
        student1.viewDetails();

        MyStudent volkanStudent = new MyStudent();
        volkanStudent.name = "Volkan" ;
        volkanStudent.surname = "Ulutaş";
        volkanStudent.graduationDate = date;

        volkanStudent.viewDetails();

    }
}
