package com.eld_project.lessons.Draft;

import java.util.ArrayList;
import java.util.List;

public class Draft {
    public static void main(String[] args) {

        List<String> str = new ArrayList<>();
//        Set<String> str2 = new TreeSet<>();

        str.add("First");
        str.add("Second");
        str.add("Third");


//        for (String s : str) {
//            if (!s.equals("First")) {
//                str2.add(s);
//            }
//        }

//        Set<String> stringSet = str.stream().filter(s -> !s.equals("First")).collect(Collectors.toSet()); // - перевод на Сет строк
//        str.stream().filter(s->!s.equals("First")).forEach(s-> System.out.println(s)); - фильтр, т.е. если строка не ровна значению в листе распечатывает
//        str.forEach(System.out::println);
//        stringSet.forEach(System.out::println);

//        double sum = str.stream().mapToDouble(s->s.length()).average().getAsDouble(); // среднее значение, мин и макс значение можно сделать
//        System.out.println(sum);

        str.stream().distinct().forEach(System.out::println); //метод дистинкт, удаляет дубли и оставляет только уникальные значения


        }
    }

