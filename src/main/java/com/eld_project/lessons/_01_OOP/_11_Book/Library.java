package com.eld_project.lessons._01_OOP._11_Book;

import java.util.ArrayList;
import java.util.List;

public class Library implements BookManageable {

    List<Book> books = new ArrayList<>();

    @Override
    public void addBook(String title, String author, Genre genre) {
        books.add(new Book(title, author, genre));
        System.out.println("Название: " + title + ", Автор: " + author + ", Жанр: " + genre.getDescription());
    }

    @Override
    public void showAllBook() {
        System.out.print("Доступные книги:\n");
        books.forEach(b -> System.out.println("\t" + b));
    }


    @Override
    public void listBooksByGenre(Genre genre) {
        System.out.println("Книги по жанрам: " + genre.getDescription());
        books.stream()
                .filter(book -> book.getGenre() == genre)
                .forEach(System.out::println);
    }

    @Override
    public void findBooksByAuthor(String author) {
        System.out.println("Поиск книги по автору: " + author);
        books.stream()
                .filter(book -> book.getAuthor().equals(author))
                .forEach(System.out::println);
    }

    @Override
    public void countBooksByGenre(Genre genre) {
        int count = (int) books.stream()
                .filter(book -> book.getGenre() == genre)
                .count();

        System.out.println(count == 0 ? "Не найдено такого жанра." : "В библиотеке " + count + " книги " + genre.getDescription() + " жанра");
    }
}