package com.eld_project.lessons._01_OOP._10_Rental_System;

public class Scooter implements Rentable {

    @Override
    public void rent(String customer, int duration) {
        System.out.println("Аренда самоката для " + customer + " на " + duration +
                " " + DEFAULT_UNIT + " составляет " + PRICE_SCOOTER * duration + " " + DEFAULT_CURRENCY);
    }
}
