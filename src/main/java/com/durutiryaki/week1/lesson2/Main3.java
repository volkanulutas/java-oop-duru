package com.durutiryaki.week1.lesson2;

public class Main3 {
    public static void main(String[] args) {
        Math math = new Math();
        math.setNumber(2);
        int number = math.getNumber();
        System.out.println(number);
        int pow = math.pow();
        System.out.println("pow: " + pow);
        System.out.println("--------------");
        Math math2 = new Math();
        math2.setNumber(9);
        int pow2 = math2.pow();
        System.out.println("Pow2: " + pow2);
        math2.setNumber(5);
        int power = math2.pow();
        System.out.println("Power " + power);
    }

}
