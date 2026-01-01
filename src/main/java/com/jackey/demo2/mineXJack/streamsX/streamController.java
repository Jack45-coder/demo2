package com.jackey.demo2.mineXJack.streamsX;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class streamController {
    public static void main(String[] args) {
        Stream<List<String>> studentLists = Stream.of(
                List.of("Ravi", "Aman"),
                List.of("Jack", "Neha", "Sneha"),
                List.of("Suman", "Rohan")
        );

        studentLists.flatMap(list -> list.stream()).filter(name -> name.startsWith("S"))
                .forEach(s -> System.out.println(s + " " + s.length()));

    }
}
