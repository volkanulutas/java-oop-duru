package com.durutiryaki.week6.week6_exceptionhandling;

public class W6L4 {
    public static void main(String[] args) {
        try {
            validateAge(15);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    static void validateAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age is not valid for voting");
        } else {
            System.out.println("Welcome to vote");
        }
    }
}
