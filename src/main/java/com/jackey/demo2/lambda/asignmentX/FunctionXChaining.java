package com.jackey.demo2.lambda.asignmentX;
/*
🔴 ASSIGNMENT 8 — Function Chaining ( andThen )
Problem
Create:
1. Function that multiplies a number by 2
2. Function that converts number to string
Chain them and use in a stream.
Focus
Function.andThen()
Clean pipeline logic
 */
import java.util.List;
import java.util.function.Function;

public class FunctionXChaining {
    public static void main(String[] args) {
        Function<Integer, Integer> multiplyBy2 = (n) -> n*2;
        Function<Integer, String> convertXString = (n) -> "Result: " + n;
        Function<Integer, String> combinedXFunction = multiplyBy2.andThen(convertXString);
        List<Integer> intList = List.of(2, 4, 7, 3, 9);
        intList.stream().map(combinedXFunction).forEach(System.out::println);
    }
}
