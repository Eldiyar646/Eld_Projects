package com.eld_project.lessons._01_OOP._09_TaxiPark;

public class LuxuryCar extends Car {
    public LuxuryCar(String brand, String model, String licensePlate) {
        super(brand, model, licensePlate);
    }

    @Override
    public void printInfo() {
        System.out.println("Люкс такси: " + brand + " " + model + " [" + licensePlate + "], WI-FI и вода включены.");
    }
}
