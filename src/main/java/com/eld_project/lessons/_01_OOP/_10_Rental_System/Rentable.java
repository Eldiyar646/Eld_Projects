package com.eld_project.lessons._01_OOP._10_Rental_System;

public interface Rentable {

    String DEFAULT_UNIT = "час";
    String DEFAULT_CURRENCY = "сом";
    int PRICE_BIKE = 100;
    int PRICE_SCOOTER = 150;

    void rent(String customer, int duration);

    default void showStandardInfo() {
        printInfo("Минимальное время аренды 1 час.");
    }

    default void rentStandard(String customer) {
        showStandardInfo();
        rent(customer, 1);

    }

    static void rentalPolicy() {
        System.out.println("Оставляйте велосипед / самокат в зеленой зоне.");
    }

    private void printInfo(String message) {
        System.out.println("[LOG] " + message);
    }


}