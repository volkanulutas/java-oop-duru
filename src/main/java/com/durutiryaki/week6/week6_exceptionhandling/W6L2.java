package com.durutiryaki.week6.week6_exceptionhandling;

public class W6L2 {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            int result = numbers[5] / 0; //     int result = numbers[2] / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException exception: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException exception: " + e.getMessage());
        }
    }
}
