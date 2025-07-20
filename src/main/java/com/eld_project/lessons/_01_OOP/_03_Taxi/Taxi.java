package com.eld_project.lessons._01_OOP._03_Taxi;

public class Taxi {

    String name;
    double[] rating;
    int lateCount;

    public Taxi(String name, double[] rating, int lateCount) {
        this.name = name;
        this.rating = rating;
        this.lateCount = lateCount;
    }

    public double sumAll() {
        double sum = 0;
        for (double r : rating) {
            sum += r;
        }
        return sum;
    }

    public double averageRating () {
        return sumAll() / rating.length;
        }

    public void printAll() {
        if (rating.length >= 5 && averageRating() >= 4.5 && lateCount <= 1) {
            System.out.println(name + ": Good driver." + " Rating: " + averageRating());
        } else {
            System.out.println(name + ": Not qualified." + " Rating: " + averageRating());
        }
    }



}
