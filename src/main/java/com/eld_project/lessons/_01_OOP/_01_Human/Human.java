package com.eld_project.lessons._01_OOP._01_Human;

public class Human {
    String name;
    String gender;
    int age;

    public Human(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Имя: " + name + ", Пол: " + gender + ", Возраст: " + age + ", ";
    }

    public String walk(int stepCounts) {
        return (gender.equalsIgnoreCase("Женский")) ? name + " прошла " +
                stepCounts + " шагов." : name + " прошел " + stepCounts + " шагов.";
    }

    public String work(String jobTitle) {
        return (gender.equalsIgnoreCase("Женский")) ? "Она работает " + jobTitle : "Он работает " + jobTitle;
    }
}
