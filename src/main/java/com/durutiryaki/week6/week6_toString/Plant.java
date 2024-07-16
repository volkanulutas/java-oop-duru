package com.durutiryaki.week6.week6_toString;

public class Plant {
    private String color;

    private int age;

    private boolean isLikeSun;

    public Plant(String color, int age, boolean isLikeSun) {
        this.color = color;
        this.age = age;
        this.isLikeSun = isLikeSun;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isLikeSun() {
        return isLikeSun;
    }

    public void setLikeSun(boolean likeSun) {
        isLikeSun = likeSun;
    }

    // functionality
    public void growth() {
        System.out.println("Plant is growing...");
    }

    @Override
    public String toString() {
        return "Plant{" + "color='" + color + '\'' + ", age=" + age + ", isLikeSun=" + isLikeSun + '}';
    }
}
