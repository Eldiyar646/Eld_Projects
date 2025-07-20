package com.eld_project.lessons._01_OOP._08_Library;

import java.util.ArrayList;
import java.util.List;

public class Reader {

    private String name;
    private List<Book> borrowedBooks;

    public Reader(String name) {
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public void borrow(Book book) {
        if (book.isAvailable()) {
            book.borrowBook();
            borrowedBooks.add(book);
        } else {
            System.out.println("Книга \"" + book + "\" недоступна.");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.remove(book)) {
            book.returnBook();
        } else {
            System.out.println("У читателя нет этой книги");
        }
    }

    public void printBorrowedBooks() {
        System.out.println("Книги, которые взял " + name + ":");
        borrowedBooks.stream().forEach(s -> System.out.println(" - " + s));

    }
}