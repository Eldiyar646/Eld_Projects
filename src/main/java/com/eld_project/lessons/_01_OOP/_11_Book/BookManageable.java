package com.eld_project.lessons._01_OOP._11_Book;

public interface BookManageable {

    void addBook(String title, String author, Genre genre);
    void showAllBook();
    void listBooksByGenre(Genre genre);

    void findBooksByAuthor(String author);
    void countBooksByGenre(Genre genre);
}
