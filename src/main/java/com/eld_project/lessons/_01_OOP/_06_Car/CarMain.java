package com.eld_project.lessons._01_OOP._06_Car;

public class CarMain {
    public static void main(String[] args) {

        Body body = new Body("Sedan");
        Engine engine = new Engine("i-vtec", 2.4);
        Wheels wheels = new Wheels("Winter", 16);

        Car honda = new Car(engine, body, wheels);
        System.out.println(honda);




    }


}
