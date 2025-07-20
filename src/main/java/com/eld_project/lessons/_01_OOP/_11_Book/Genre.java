package com.eld_project.lessons._01_OOP._11_Book;

public enum Genre {
    HISTORY("Исторический"),
    SCIENCE("Научный"),
    ROMANCE("Роман");

    private final String description;

    Genre(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}