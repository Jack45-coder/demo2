package com.jackey.demo2.lambda.asignmentX;
/*
🔴 ASSIGNMENT 2 — Predicate Chaining
Problem
Create two Predicates:
1. isEven
2. isGreaterThan10
Chain them to print numbers that are even and greater than 10.
Focus
Predicate.and()
Reusability of lambdas
 */
import java.util.List;
import java.util.function.Predicate;

public class PredicateXChaining {
    public static void main(String[] args) {
        Predicate<Integer> isEven = (n) -> n % 2 == 0;
        Predicate<Integer> isGreaterThan10 = (n) -> n >= 10;

        List<Integer> intList = List.of(10, 15, 24, 44, 76,97, 77);
        intList.stream()
                .filter(isEven.and(isGreaterThan10))
                .forEach(n -> System.out.println(n + " "));

    }
}
