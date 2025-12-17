package com.jackey.demo2.lambda.asignmentX;
/*
󾠯 Problem #2 — Readability Drops in Real Codebases
This is fine for 1–2 lines, but in real systems:
.filter(x -> x > 10 && x % 2 == 0 && x < 100)
.map(x -> x * x + 3)
Now ask:
What does this filter do?
What does this transformation represent?
📌 Named lambdas communicate intent, not just logic
 */
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdasXLogic {
    static void process(
            List<Integer> number,
            Predicate<Integer> predict,
            Function<Integer, Integer> asx,
            Consumer<Integer> action
    ){
        number.stream()
                .filter(predict)
                .map(asx)
                .forEach(action);
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 12, 18, 101, 44, 60, 90);
         Predicate<Integer> xGrater10 = n -> n > 10;
         Predicate<Integer> isEven = n -> n % 2== 0;
         Predicate<Integer> xLess100 = n -> n < 100;
         Predicate<Integer> finalCondition = xGrater10.and(isEven).and(xLess100);
         Function<Integer, Integer> solution = n -> n*n+3;
         Consumer<Integer> printer = System.out::println;
         process(numbers, finalCondition, solution, printer);

    }
}
