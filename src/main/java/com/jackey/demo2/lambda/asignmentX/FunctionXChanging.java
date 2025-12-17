package com.jackey.demo2.lambda.asignmentX;
/*
🔴 ASSIGNMENT 6 — Function Changing Type (VERY
IMPORTANT)
Problem
Create a Function<Integer, String> that converts a number to
"Value is : <number>" .
Use it in map() .
Focus
Type transformation in streams
map() output type change

 */
import java.util.function.Function;
import java.util.stream.Stream;

public class FunctionXChanging {
    public static void main(String[] args) {
        Function<Integer, String> integerToString = (n) -> "Value is : " +n;

        Stream<Integer> integerStream =Stream.of(2, 4, 6, 3, 7);
        integerStream.map(integerToString).forEach(System.out::println);
    }
}
