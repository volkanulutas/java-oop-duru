package com.durutiryaki.week1.lesson;

public class Animal2 {
    private int id;

    private String name;

    private int age;

    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void viewDetails() {
        System.out.println("Animal2{" + "name='" + name + '\'' + ", age=" + age + ", type='" + type + '\'' + '}');
    }
}
