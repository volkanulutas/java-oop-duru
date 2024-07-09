package com.durutiryaki.week1.homework2;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setTitle("Atomic Habits");
        book1.setAuthor("James Claire");
        book1.setType("Self-Improvement");
        book1.setPublicationDate(LocalDate.of(2018, 10, 16));
        book1.setPublisher("Pegasus");
        book1.setIsbn("9786052998380");
        book1.setTotalPageNumber(320);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type your current page number:");
        int userInput = scanner.nextInt();
        book1.setCurrentPageNumber(userInput);
        book1.viewDetails();
        book1.read();

    }
}
