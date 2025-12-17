package com.jackey.demo2.lambda;

import java.util.function.Function;
import java.util.List;

public class RunnableXFunction {
    public static void main(String[] args) {
        Runnable r = () -> {
            Function<String, Integer> findXLength = (str) -> str.length();
            List<String> stringList = List.of("Jackey", "Simpal", "Dipti", "Adarsh", "Ram");
            stringList.stream().map(findXLength).forEach(System.out::println);
        };
        r.run();
    }
}
