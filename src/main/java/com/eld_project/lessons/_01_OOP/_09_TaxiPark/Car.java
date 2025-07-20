package com.eld_project.lessons._01_OOP._09_TaxiPark;

public abstract class Car {
    protected String brand;
    protected String model;
    protected String licensePlate;
    protected boolean isAvailable;

    public Car(String brand, String model, String licensePlate) {
        this.brand = brand;
        this.model = model;
        this.licensePlate = licensePlate;
        this.isAvailable = true;
    }

    public void acceptOrder(String destination) {
        if(isAvailable) {
            isAvailable = false;
            System.out.println(getClass().getSimpleName() + " " + licensePlate + " принял заказ до " + destination);
        } else {
            System.out.println("Машина " + licensePlate + " занята.");
        }
    }

    public void completeOrder() {
        isAvailable = true;
        System.out.println("Машина " + licensePlate + " освободилась.");
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public abstract void printInfo();
}