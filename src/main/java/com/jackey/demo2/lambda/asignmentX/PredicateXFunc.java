package com.jackey.demo2.lambda.asignmentX;
/*
ASSIGNMENT 7 — Predicate + Function Together
Problem
Given a list of integers:
1. Use Predicate to filter odd numbers
2. Use Function to convert them into "Odd: <number>"
Focus
Combining filter() + map()
Passing lambdas as variables
 */
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateXFunc {
    public static void main(String[] args) {
        Predicate<Integer> getOdd = (n) -> n % 2 != 0;
        Function<Integer, Integer> covertCube = (n) -> n*n*n;
        Consumer<Integer> printNumber = (n) -> System.out.println(n + " ");

        List<Integer> intList = List.of(10, 9, 4, 3, 7, 9);
        intList.stream().filter(getOdd).map(covertCube).forEach(printNumber);
    }
}
