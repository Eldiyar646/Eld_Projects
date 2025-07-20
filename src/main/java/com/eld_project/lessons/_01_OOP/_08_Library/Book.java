package com.eld_project.lessons._01_OOP._08_Library;

public class Book {

    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public boolean isAvailable() {
        return isAvailable;
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

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " взята в аренду.");
        } else {
            System.out.println(title + "недоступна.");
        }
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println(title + " возвращена в библиотеку.");

    }

    @Override
    public String toString() {
        return title + " - " + author + (isAvailable ? " (досутпна)" : " (в аренде)" );
    }
}
