package com.eld_project.lessons._01_OOP._03_Taxi;

public class TaxiMain {
    public static void main(String[] args) {

        Taxi driver01 = new Taxi("Sam", new double[]{5,5,5,4,5}, 0);
        driver01.printAll();

        Taxi driver02 = new Taxi("Alex", new double[]{5, 4, 5, 5, 4}, 2);
        driver02.printAll();

        Taxi driver03 = new Taxi("Tom", new double[]{5, 5, 5, 4, 5}, 1);
        driver03.printAll();

        Taxi driver04 = new Taxi("Clark", new double[]{5, 4, 4, 5, 5}, 3);
        driver04.printAll();

    }
}
