package com.eld_project.lessons._01_OOP._10_Rental_System;

public class Bike implements Rentable {


    public void rent(String customer, int duration) {
        System.out.println("Велоаренда для " + customer + " на " + duration +
                " " + DEFAULT_UNIT + " составляет " + PRICE_BIKE * duration + " " + DEFAULT_CURRENCY);
    }
}

