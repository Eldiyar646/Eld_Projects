package com.eld_project.lessons._01_OOP._09_TaxiPark;

public class EconomyCar extends Car {
    public EconomyCar(String brand, String model, String licensePlate) {
        super(brand, model, licensePlate);
    }

    @Override
    public void printInfo() {
        System.out.println("Эконом такси: " + brand + " " + model + " [" + licensePlate + "], скидка 10%");
    }
}
