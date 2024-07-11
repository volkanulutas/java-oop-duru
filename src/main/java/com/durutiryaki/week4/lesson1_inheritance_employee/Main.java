package com.durutiryaki.week4.lesson1_inheritance_employee;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Duru Tiryaki", 1, "CEO", "leadership"); // cntrl + P show available parameters shortcut.
        //employee1.introduce();
        Manager manager2 = new Manager("Tarık Karşı", 7, "İnşaat Proje/Uygulama","managing constuction department", 2);
        //manager2.introduce();
        Engineer engineer5 = new Engineer("Nehir Ağca", 8, "İnşaat Proje/Uygulama", "plan, design, and supervise the construction and maintenance of building and infrastructure projects", "İnşat Mühendisi");
        //engineer5.introduce();
        Engineer engineer6 = new Engineer("Taylan Çelik", 9, "İnşaat Proje/Uygulama","controlling and licensing issues", "İnşaat Mühendisi");
        //engineer6.introduce();
        Employee employee2 = new Employee("Fatma Kalaycı", 10, "Genel İşler", "cleaning");
        //employee2.introduce();
        employee1.performTask();
        engineer5.performTask();
        manager2.performTask();
        engineer6.performTask();
        employee2.performTask();

        /*
        Manager manager1 = new Manager("Ahmet Yılmaz", 2, "Yazılım Mühendisliği", 4);
        manager1.introduce();
        Engineer engineer1 = new Engineer("Volkan Ulutaş", 3, "Yazılım Mühendisliği", "Backend Yazılım Mühendisi");
        engineer1.introduce();
        Engineer engineer2 = new Engineer("Veli Bayar", 4, "Yazılım Mühendisliği", "Frontend Yazılım Mühendisi");
        engineer2.introduce();
        Engineer engineer3 = new Engineer("Onurcan Yozgat", 5, "Yazılım Mühendisliği", "Veritabanları Mühendisi");
        engineer3.introduce();
        Engineer engineer4 = new Engineer("Ayşe Yaşar", 6, "Yazılım Mühendisliği", "Test Mühendisi");
        engineer4.introduce();
        */
    }
}
