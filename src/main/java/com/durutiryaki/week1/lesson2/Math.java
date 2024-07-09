package com.durutiryaki.week1.lesson2;

public class Math {

    private int number;
    // f(x) = x^2 // 2
    
    public void setNumber(int n) {
        number = n;
    }

    public int getNumber() {
        return number;
    }

    // functionaly
    public int pow() {
        return number * number;
    }
}
