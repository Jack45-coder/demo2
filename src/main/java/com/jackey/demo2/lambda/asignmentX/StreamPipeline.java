package com.jackey.demo2.lambda.asignmentX;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Consumer;

/*
🔥 ASSIGNMENT 11 — Full Pipeline (REAL INTERVIEW
STYLE)
Problem
Given a list of integers:
1. Predicate → keep numbers > 50
2. Function → convert to "Passed: <number>"
3. Consumer → print result
Focus
Predicate → Function → Consumer flow
Stream pipeline clarity
 */
public class StreamPipeline {
    public static void main(String[] args) {
        Predicate<Integer> isGraterThan50 = (n) -> n > 50;
        Function<Integer, String> convertXString = (n) -> "Passed: " + n;
        Consumer<String> printer = (s) -> System.out.println(s + " ");

        List<Integer> numbers = List.of(10, 43, 55, 72, 19, 90);
        numbers.stream()
                .filter(isGraterThan50)
                .map(convertXString)
                .forEach(printer);
    }
}
