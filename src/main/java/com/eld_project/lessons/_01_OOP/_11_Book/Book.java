package com.eld_project.lessons._01_OOP._11_Book;

public class Book {
    private final String title;
    private final String author;
    private final Genre genre;

    public Book(String title, String author, Genre genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Genre getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Название: " + title + ", Автор: " + author + ", Жанр: " + genre.getDescription();
    }
}
