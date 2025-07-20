package com.eld_project.lessons._01_OOP._09_TaxiPark;

public class Taxi_Park_Main {
    public static void main(String[] args) {

        TaxiPark park = new TaxiPark();
        park.addCar(new EconomyCar("Kia", "K7", "123AAB"));
        park.addCar(new LuxuryCar("Lexus", "GS 300", "646AAA"));
        park.addCar(new EconomyCar("Hyundai", "Sonata", "321BBI"));

        park.showAvailableCars();
        System.out.println("******************");

        park.assignOrder("Airport");
        park.assignOrder("Tommy Mall");
        park.assignOrder("Jannat Resort");
        park.assignOrder("Mega");

        System.out.println();
        park.showAvailableCars();


    }
}
