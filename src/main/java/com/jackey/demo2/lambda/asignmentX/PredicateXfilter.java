package com.jackey.demo2.lambda.asignmentX;

/*
� ASSIGNMENT 1 — Predicate with filter()
Problem
Given a list of integers, write a Predicate that checks if a number is positive, and
use it in a stream to print only positive numbers.
Focus
Writing Predicate lambda
Passing it to
filter()
📌
Do NOT write logic directly inside filter
 */

import java.util.List;
import java.util.function.Predicate;

public class PredicateXfilter {
    public static void main(String[] args) {
        Predicate<Integer> positiveNum = (n) -> n > 0;

        List<Integer> intList = List.of(10, -20, -12, 2, 4, 5);
        intList.stream().filter(positiveNum).forEach(n -> System.out.println(n + " "));

    }
}
