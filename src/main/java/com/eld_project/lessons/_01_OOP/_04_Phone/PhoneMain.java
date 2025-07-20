package com.eld_project.lessons._01_OOP._04_Phone;

public class PhoneMain {
    public static void main(String[] args) {

        Phone phoneInfo = new Phone("Samsung", "158532659874", "Purple");
        phoneInfo.receiveCall("Alex", "");
        System.out.println(phoneInfo + ", Страна производитель: " + Phone.madeIn);

        System.out.println("*****************************\n");

        Phone phoneInfo2 = new Phone("Iphone", "3265923218741", "White");
        phoneInfo.receiveCall("Sam", "+7998569541");
        System.out.println(phoneInfo2 + ", Страна производитель: " + Phone.madeIn);

        System.out.println("*****************************\n");

        phoneInfo2.setColor("Black");
        phoneInfo.receiveCall("Sam", "+7998569541");
        System.out.println(phoneInfo2 + ", Страна производитель: " + Phone.madeIn);


    }
}
