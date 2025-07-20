package com.eld_project.lessons._01_OOP._04_Phone;

public class Phone {
    static String madeIn = "Vietnam ";

    private String model;
    private String serialNumber;
    private String color;


    public Phone() {
    }

    public Phone(String model, String serialNumber, String color) {
        this.model = model;
        this.serialNumber = serialNumber;
        this.color = color;
    }

    public String toString () {
        return "Модель: " + model + ", Серийный номер: " + serialNumber + ", Цвет: " + color;
    }

    public void receiveCall(String name, String number) {
        if (number.isEmpty()) {
            System.out.println("Звонит: " + name);
        } else {
            System.out.println("Звонит: " + name + ", " + "Номер телефона: " + number);
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
