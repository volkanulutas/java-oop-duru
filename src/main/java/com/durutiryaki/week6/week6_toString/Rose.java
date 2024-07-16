package com.durutiryaki.week6.week6_toString;

public class Rose extends Flower {
    private boolean isThorn;

    public Rose(String color, int age, boolean isLikeSun, boolean isThorn) {
        super(color, age, isLikeSun);
        this.isThorn = isThorn;
    }

    public boolean isThorn() {
        return isThorn;
    }

    public void setThorn(boolean thorn) {
        isThorn = thorn;
    }

    @Override
    public String toString() {
        return "Rose{" + "color='" + super.getColor() + '\'' + ", age=" + super.getAge() + ", isLikeSun=" + super.isLikeSun() + ", isThorn=" + this.isThorn() + '}';
    }
}
