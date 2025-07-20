package com.eld_project.lessons._01_OOP._05_Deliver;

public class DeliverMain {
    public static void main(String[] args) {

        Deliver deliver = new Deliver();
        deliver.calculateDeliverPrice(Deliver_Types.STEP);
        deliver.calculateDeliverPrice(Deliver_Types.AUTO);
        deliver.calculateDeliverPrice(Deliver_Types.AIR);
        deliver.calculateDeliverPrice(Deliver_Types.SEA);




    }
}
