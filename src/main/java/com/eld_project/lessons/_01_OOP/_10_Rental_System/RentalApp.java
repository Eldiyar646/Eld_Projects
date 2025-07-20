package com.eld_project.lessons._01_OOP._10_Rental_System;

public class RentalApp {
    public static void main(String[] args) {

        Rentable bike = new Bike();
        bike.rent("Timur", 4);
        bike.showStandardInfo();
        System.out.println();

        Rentable scooter1 = new Scooter();
        scooter1.rent("Aizat",2);
        scooter1.showStandardInfo();
        System.out.println();

        Rentable scooter2 = new Scooter();
        scooter2.rent("Eld",3);
        scooter2.showStandardInfo();
        System.out.println();

        Rentable.rentalPolicy();
    }
}