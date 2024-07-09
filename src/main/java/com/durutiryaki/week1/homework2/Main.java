package com.durutiryaki.week1.homework2;


// import java.time.LocalDate;

import java.time.LocalDate;
import java.util.*; // Tüm java.util paketini yükler. Scanner dışında da bir türü kullanmadığımız sınıf gelmiş olur.

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
        System.out.println("******************");
        //
        Book book2 = new Book("Olabilir", "İzzet Güllü",  "Psyhcology", LocalDate.of(2024, 07, 01), "X Yayınları", "ABC123", 300, 0);
        System.out.println("Lütfen şu an bulunduğunuz sayfayı giriniz: ");
        int userCurrentPage = scanner.nextInt();
        book2.setCurrentPageNumber(userCurrentPage);

        book2.viewDetails();
        book2.read();


    }
}
