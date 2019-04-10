package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Catalog {

    public List<Borrowable> items;

    public List<Borrowable> unavailables;

    private ArrayList<String> borrow_log;


    public List<Borrowable> getItems() {
        return items;
    }


    public Catalog() {
        this.items = new ArrayList<Borrowable>();
    }

    public boolean borrowItem(String title) {

        Borrowable item = getByTitle(title);

        if (item == null) {
            System.out.println("Sorry, that" + item.getClass() + "is not available");
            return false;
        } else {
            if (item.isAvailable()) {
                item.checkOut();
                System.out.println("Thank you! Enjoy the " + item.getClass());
                return true;
            }
        }

        System.out.println("Sorry, that" + item.getClass() + "is not available");

        return false;
    }

    public Borrowable getByTitle(String title) {

        for (Borrowable item : items) {
            if (item.getTitle().equals(title)) {
                return item;
            }
        }
        return null;
    }

    public List<Borrowable> getAvailableItems() {
        List<Borrowable> available = new ArrayList<Borrowable>();

        for (Borrowable item : items) {
            if (item.isAvailable()) {
                available.add(item);
            }
        }

        return available;
    }

    public boolean returnItem(String title) {
        return false;
    }
}