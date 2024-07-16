package com.durutiryaki.week6.week6_toString;

public class Orchide extends Flower {
    private int numberOfFlowers;

    public Orchide(String color, int age, boolean isLikeSun, int numberOfFlowers) {
        super(color, age, isLikeSun);
        this.numberOfFlowers = numberOfFlowers;
    }

    public int getNumberOfFlowers() {
        return numberOfFlowers;
    }

    public void setNumberOfFlowers(int numberOfFlowers) {
        this.numberOfFlowers = numberOfFlowers;
    }

    @Override
    public String toString() {
        return "Orchide{" + "color='" + super.getColor() + '\'' + ", age=" + super.getAge() + ", isLikeSun=" + super.isLikeSun() + ", " +
                "numberOfFlowers=" + this.getNumberOfFlowers() + '}';
    }
}
