package com.durutiryaki.week6.week6_toString;

public class Flower extends Plant {
    public Flower(String color, int age, boolean isLikeSun) {
        super(color, age, isLikeSun);
    }

    @Override
    public String toString() {
        return "Flower{" + "color='" + super.getColor() + '\'' + ", age=" + super.getAge() + ", isLikeSun=" + super.isLikeSun() + '}';
    }
}
