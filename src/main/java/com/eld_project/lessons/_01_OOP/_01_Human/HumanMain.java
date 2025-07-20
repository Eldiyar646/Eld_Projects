package com.eld_project.lessons._01_OOP._01_Human;

public class HumanMain {
    public static void main(String[] args) {

        Human human01 = new Human("Айзат", "Женский", 25);
        System.out.println(human01 + human01.work("врачом") + ", " + human01.walk(800));

        Human human02 = new Human("Алияр", "Мужской", 21);
        System.out.println(human02 + human02.work("хирургом") + ", " + human02.walk(500));

        Human human03 = new Human("Элдияр", "Мужской", 30);
        System.out.println(human03 + human03.work("управляющим") + ", " + human03.walk(1000));

        Human human04 = new Human("Алима", "Женский", 18);
        System.out.println(human04 + human04.work("директором") + ", " + human04.walk(590));





    }
}
