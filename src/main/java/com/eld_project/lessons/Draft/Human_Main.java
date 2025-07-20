package com.eld_project.lessons.Draft;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Human_Main {
    public static void main(String[] args) {

        Human_H human1 = new Human_H("Настя", 18, 70.5);
        Human_H human2 = new Human_H("Петя", 53, 80);
        Human_H human3 = new Human_H("Вася", 15, 25);
        Human_H human4 = new Human_H("Мефодий", 13, 30);
        Human_H human5 = new Human_H("Иван", 25, 62);

        List<Human_H> humans = new ArrayList<>();
        humans.add(human1);
        humans.add(human2);
        humans.add(human3);
        humans.add(human4);
        humans.add(human5);

//        int maxAgeHumanIndex = 0;
//        int maxAge = 0;
//        for (int i = 0; i < humans.size(); i++) {
//            if (maxAge < humans.get(i).getAge()) {
//                maxAge = humans.get(i).getAge();
//                maxAgeHumanIndex = i;
//            }
//        }
//        System.out.println("Max age " + humans.get(maxAgeHumanIndex).getName());

//        Human_H max = humans.stream().max(Comparator.comparing(Human_H::getAge)).get();
//        System.out.println("Max age " + max.getName());

        humans.stream()
                .filter(h -> h.getName().endsWith("я"))
                .filter(h -> h.getName().endsWith("тя"))
                .forEach(h -> System.out.println(h.getName()));

        Human_H max = humans.stream().max(Comparator.comparing(Human_H::getWeight)).get();
        System.out.println("Max weight: " + max.getName());

        humans.stream().filter(w -> w.getWeight()  > 50).forEach(w -> System.out.println(w.getName()));

        humans.stream()
                .map(h -> h.getName() + " весит " + h.getWeight() + " кг")
                .forEach(System.out::println);


    }
}
