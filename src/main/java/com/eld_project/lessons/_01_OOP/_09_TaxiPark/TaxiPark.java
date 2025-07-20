package com.eld_project.lessons._01_OOP._09_TaxiPark;

import java.util.ArrayList;
import java.util.List;

public class TaxiPark {

    private List<Car> cars;

    public TaxiPark() {
        this.cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void showAvailableCars() {
        System.out.println("Доступные машины: ");
        for (Car car : cars) {
            if(car.isAvailable) {
                car.printInfo();
            }
        }
    }

    public Car findAvailableCar() {
        for (Car car : cars) {
            if(car.isAvailable()) {
                return car;
            }
        }
        return null;
    }

    public void assignOrder(String destination) {
        Car car = findAvailableCar();
        if(car != null) {
            car.acceptOrder(destination);
        } else {
            System.out.println("Нет доступных машин.");
        }

    }
}