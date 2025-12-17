package com.jackey.demo2.lambda.asignmentX;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/*
🔥 ASSIGNMENT 12 — What NOT to Do (TRICK)
Problem
Why is this bad practice?
list.stream()
 .filter(x -> x > 10)
 .map(x -> x * x)
 .forEach(x -> System.out.println(x));
Rewrite it using:
Predicate
Function
Consumer variables
 */
public class Ass12 {
    public static void main(String[] args) {
        Predicate<Integer> isGrater10 = (n) -> n > 10;
        Function<Integer, Integer> square = (n) -> n*n;
        Consumer<Integer> printer = System.out::println;

        List<Integer> listX = List.of(1, 5, 14, 9, 13, 24);

        listX.stream().filter(isGrater10).map(square).forEach(printer);
    }
}
