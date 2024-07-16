package com.durutiryaki.week1.lesson;

public class Main {
    public static void main(String[] args) {
        Animal2 animal1 = new Animal2();
        // animal1.setId(1); // erişimi istemedik, datayı açmadık.
        animal1.setName("Panda");
        animal1.setAge(2);
        animal1.setType("Memeli");
        System.out.println("------------");
        System.out.println("Hayvan adı: " + animal1.getName() + " Hayvan türü: " + animal1.getType());
        animal1.viewDetails();
    }
}
