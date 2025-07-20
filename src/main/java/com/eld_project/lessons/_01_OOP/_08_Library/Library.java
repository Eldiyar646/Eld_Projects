package com.eld_project.lessons._01_OOP._08_Library;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBooks(Book book) {
        books.add(book);
    }

    public void printAvailableBooks() {
        System.out.println("Доступные книги: ");
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println(" - " + book);
            }
        }
    }

    public List<Book> getBooks() {
        return books;
    }
}