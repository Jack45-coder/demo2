package com.jackey.demo2.collection;

import java.util.*;

public class MapController {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of(
                "One", 1,
                "Two", 2,
                "Three", 3
        );

        // Iterating using for-each loop:
//        for(Map.Entry<String, Integer> entry : map.entrySet()){
//            System.out.println("Key: " + entry.getKey() + ", Value: " +entry.getValue());
//        }


        // for each method with lambda:
//        map.forEach((key, value) -> {
//            System.out.println("Key: " + key + "Value: " + value);
//        });

        // sort map by keys:
        Map<String , Integer> sortedByKeys = new TreeMap<>(map);
        System.out.println("Sorted by Keys: " + sortedByKeys);
        map.forEach((key, value) -> {
            System.out.println("Key: " +key + " Value: " +value);
        });


        // sort map by values:

        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet().stream().toList());
        System.out.println(entryList);


        // asc sorting by values
        Collections.sort(entryList, (e1,  e2) -> e2.getValue().compareTo(e1.getValue()));
        Map<String, Integer> sortedByValuesAsc = new LinkedHashMap<>();
        entryList.forEach(entry -> {
            sortedByValuesAsc.put(entry.getKey(), entry.getValue());
        });
        System.out.println(sortedByValuesAsc);
    }
}
