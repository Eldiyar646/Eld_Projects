package com.eld_project.lessons._01_OOP._08_Library;

public class LibraryMain {
    public static void main(String[] args) {

    Library library = new Library();

    Book b1 = new Book("Преступление и наказание", "Ф.Достоевский");
    Book b2 = new Book("Война и мир", "Л.Толстой");
    Book b3 = new Book("Мастер и Маргарита", "М.Булгаков");

    library.addBooks(b1);
    library.addBooks(b2);
    library.addBooks(b3);

    Reader reader = new Reader("Eld");

    library.printAvailableBooks();
        System.out.println();

        reader.borrow(b1);
        reader.borrow(b3);
        System.out.println();

        reader.printBorrowedBooks();
        System.out.println();

        library.printAvailableBooks();
        System.out.println();

        reader.returnBook(b1);
        System.out.println();

        library.printAvailableBooks();

        reader.printBorrowedBooks();
        System.out.println();


    }
}
