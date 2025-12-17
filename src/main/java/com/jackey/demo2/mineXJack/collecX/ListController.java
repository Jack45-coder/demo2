package com.jackey.demo2.mineXJack.collecX;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListController {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 6);
        List<String> stringList = new ArrayList<>();
        Map<String, Student> studentMap = new HashMap<>();

        list.stream()
                .filter(n -> n%2 == 0) // chhaan-na (Predict)
                .map(n -> n*10) // badalna
                .forEach(System.out::println); //play + output

        stringList.add("Ramesh");
        stringList.add("Jacob");
        stringList.add("Simpal");
        stringList.add("Nandu");

        stringList.forEach(s -> System.out.println(s));

        studentMap.put("1ACC", new Student("Jackey Kumar", 45));
        studentMap.put("2BCA", new Student("Simpal Kumari", 49));
        studentMap.put("C3E4", new Student("Sanjana Kumari", 30));
        studentMap.put("D2HE", new Student("David Jazz", 35));

        studentMap.entrySet()
                .forEach(entry ->
                                System.out.println("Id: " + entry.getKey() + " , "+ "Name: " + entry.getValue().getName()+ " , " +"Marks: " + entry.getValue().getMarks())
                        );
    }

}
