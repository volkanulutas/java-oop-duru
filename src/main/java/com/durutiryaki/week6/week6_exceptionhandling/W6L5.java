package com.durutiryaki.week6.week6_exceptionhandling;

public class W6L5 {
    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age is not valid for voting");
        } else {
            System.out.println("Welcome to vote");
        }
    }
}
