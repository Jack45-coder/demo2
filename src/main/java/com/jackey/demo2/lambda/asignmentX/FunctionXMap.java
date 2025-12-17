package com.jackey.demo2.lambda.asignmentX;
/*
🔴 ASSIGNMENT 5 — Function with map()
Problem
Create a Function<Integer, Integer> that returns the square of a number.
Use it in a stream to transform a list.
Focus
Writing Function<T, R>
Using it with map()

 */
import java.util.List;
import java.util.function.Function;

public class FunctionXMap {
    public static void main(String[] args) {
        Function<Integer, Integer> transformSquare = (n) -> n*n;

        List<Integer> intList = List.of(2, 5, 9, 12, 19, 25);
        intList.stream().map(transformSquare)
                .forEach(n -> System.out.println(n + " "));
    }
}
