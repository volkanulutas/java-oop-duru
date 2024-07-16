package com.durutiryaki.week6.week6_exceptionhandling;

public class W6L4 {
    public static void main(String[] args) throws Exception {
        try {
            validateAge(15);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        System.out.println("end of");
    }

    static void validateAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age is not valid for voting");
        } else {
            System.out.println("Welcome to vote");
        }
    }
}
