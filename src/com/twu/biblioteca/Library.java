package com.twu.biblioteca;

import java.util.HashMap;

public class Library {

    private Catalog books;
    private Catalog movies;

    private HashMap <String, String> borrowedBooks = new HashMap<String, String>();

    Library() {
        this.books = new Catalog();
        this.movies = new Catalog();

        books.addItem(new Book("TDD By Example", 2002, "Kent Beck"));
        books.addItem(new Book("The Clean Coder", 2011, "Uncle Bob"));
        books.addItem(new Book("Clean Code", 2008, "Uncle Bob"));
        books.addItem(new Book("The Pragmatic Programmer", 1999, "Andrew Hunt"));

        movies.addItem(new Movie("Kill Bill Vol. 1", 2003, 8, "Quentin Tarantino"));
        movies.addItem(new Movie("Snatch", 2000, 8, "Guy Ritchie"));
        movies.addItem(new Movie("Get Out", 2017, 8, "Jordan Peele"));
        movies.addItem(new Movie("Pulp Fiction", 1994, 9, "Quentin Tarantino"));
    }

    private void printAvailableItems(Catalog catalog) {

        for (Borrowable item : catalog.getAvailableItems()) {
            System.out.println(item.toString());
        }
    }

    public void printAvailableBooks() {
        printAvailableItems(books);
    }

    public void printAvailableMovies() {
        printAvailableItems(movies);
    }

    public boolean borrowBook(String title, String userLibraryId) {
        return books.borrowItem(title, userLibraryId);
    }

    public boolean returnBook(String title) {
        return books.returnItem(title);
    }

    public boolean borrowMovie(String title) {
        return movies.borrowItem(title, "");
    }

    public boolean returnMovie(String title) {
        return movies.returnItem(title);
    }
}
