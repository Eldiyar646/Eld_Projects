package com.eld_project.lessons._01_OOP._11_Book;

public class LibraryApp {
    public static void main(String[] args) {

        Library library = new Library();

        library.addBook("Джамиля", "Ч.Айтматов", Genre.ROMANCE);
        library.addBook("Война и мир", "Л.Толстой", Genre.ROMANCE);
        library.addBook("Сегун", "Дж.Клавелл", Genre.HISTORY);
        library.addBook("Столпы земли", "К.Фоллетт", Genre.HISTORY);
        library.addBook("Математика за чашечкой кофе", "К.Маурицио", Genre.SCIENCE);
        library.addBook("Трудная жизнь зомби", "С.Мэтт", Genre.SCIENCE);
        System.out.println("---------------------------");

        library.listBooksByGenre(Genre.ROMANCE);
        System.out.println("---------------------------");

        library.findBooksByAuthor("Ч.Айтматов");
        System.out.println("---------------------------");
        library.countBooksByGenre(Genre.SCIENCE);

        library.showAllBook();


    }
}
