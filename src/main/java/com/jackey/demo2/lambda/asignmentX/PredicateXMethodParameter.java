package com.jackey.demo2.lambda.asignmentX;
/*
🔴 ASSIGNMENT 9 — Predicate as Method Parameter
(INTERVIEW FAVORITE)
Problem
Write a method:
static void process(List<Integer> list, Predicate<Integer> condition)
Use streams inside the method to print elements satisfying the condition.
Call this method with:
even predicate
positive predicate
Focus
Passing lambda as parameter
Reusability
 */

import java.util.List;
import java.util.function.Predicate;

public class PredicateXMethodParameter {
    static void process(List<Integer> list, Predicate<Integer> condition){
      list.stream().filter(condition).forEach(System.out::println);
    }

    public static void main(String[] args) {
        Predicate<Integer> isEven = (n) -> n % 2 == 0;
        Predicate<Integer> isPositive = (n) -> n > 0;
        List<Integer> intList = List.of(-5, 0, 2, 3, -1, 6);
        process(intList, isEven);
        process(intList, isPositive);


    }
}
