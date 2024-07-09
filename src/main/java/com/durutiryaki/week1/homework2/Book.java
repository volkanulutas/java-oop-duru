package com.durutiryaki.week1.homework2;

import java.time.LocalDate;

public class Book {
    private String title;

    private String author;

    private String type;

    private LocalDate publicationDate;

    private String publisher;

    private String isbn;

    private int totalPageNumber;

    private int currentPageNumber;

    public Book() {
        // default constructor.
    }

    public Book(String title, String author, String type, LocalDate publicationDate, String publisher, String isbn, int totalPageNumber,
                int currentPageNumber) {
        this.title = title;
        this.author = author;
        this.type = type;
        this.publicationDate = publicationDate;
        this.publisher = publisher;
        this.isbn = isbn;
        this.totalPageNumber = totalPageNumber;
        this.currentPageNumber = currentPageNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getPublisher() {return publisher;}

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getTotalPageNumber() {
        return totalPageNumber;
    }

    public void setTotalPageNumber(int totalPageNumber) {
        this.totalPageNumber = totalPageNumber;
    }

    public int getCurrentPageNumber() {
        return currentPageNumber;
    }

    public void setCurrentPageNumber(int currentPageNumber) {
        this.currentPageNumber = currentPageNumber;
    }

    public void viewDetails() {
        System.out.println(
                "Details of " + getTitle() + "\nTitle: " + getTitle() + "\nAuthor: " + getAuthor() + "\nType: " + getType() + "\nPublication Date: "
                        + getPublicationDate() + "\nPublisher: " + getPublisher() + "\nISBN: " + getIsbn() + "\nTotal Page Number: " + getTotalPageNumber());
    }

    public void read() {
        if (0 < currentPageNumber || currentPageNumber <= totalPageNumber) {
            System.out.println("I am currently at page number  " + currentPageNumber + ".");
        } else if (currentPageNumber == 0) {
            System.out.println("I haven't started to read the book yet.");
        } else {
            System.out.println("You entered invalid page number.");
        }

    }

}



