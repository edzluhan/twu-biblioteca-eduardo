package com.twu.biblioteca;

public class Book extends Borrowable {

    private String author;
    private int publishYear;
    private String title;


    private boolean available;

    Book(String title, int publishYear, String author){
        this.title = title;
        this.publishYear = publishYear;
        this.author = author;

    }

    @Override
    public String toString() {
        return this.title + " | " + this.author + " | " + this.publishYear;
    }

    public String getTitle() {
        return this.title;
    }

    public int getPublishYear() {
        return this.publishYear;
    }

    public String getAuthor() {
        return this.author;
    }

}