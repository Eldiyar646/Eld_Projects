package com.eld_project.lessons.Draft;

import java.util.HashMap;
import java.util.Map;

public class Draft2 {
    public static void main(String[] args) {

        Map<String, Map<String, Integer>> example = new HashMap<>();

        Map<String, Integer> test1 = new HashMap<>();
        test1.put("First", 123);
        test1.put("Second", 1);
        test1.put("Third", 12);

        Map<String, Integer> test2 = new HashMap<>();
        test2.put("First", 123);
        test2.put("Second", 1);
        test2.put("Third", 12);

        Map<String, Integer> test3 = new HashMap<>();
        test3.put("First", 123);
        test3.put("Second", 1);
        test3.put("Third", 12);

        example.put("First", test1);
        example.put("Second", test2);
        example.put("Third", test3);

//        int sum = 0;
//        for (Map.Entry<String, Map<String, Integer>> entry : example.entrySet()) {
//            for (Map.Entry<String, Integer> entry1 : entry.getValue().entrySet()) {
//                //System.out.println(entry1.getValue());
//                sum += entry1.getValue();
//            }
//        }
//        System.out.println(sum);

//        example.entrySet()
//                .stream()
//                .flatMap(s->s.getValue().values().stream())
//                .forEach(System.out::println);

        double sum = example.entrySet()
                .stream()
                .flatMap(s->s.getValue().values().stream()).mapToInt(e->e).average().getAsDouble();
        System.out.println(sum);


    }
}
