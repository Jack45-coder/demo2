package com.jackey.demo2.lambda.asignmentX;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
public class Ass13X {
    public static void main(String[] args) {

        Predicate<Integer> greaterThan10AndDivBy5 =
                n -> n > 10 && n % 5 == 0;

        Function<Integer, Integer> square =
                n -> n * n;

        Consumer<Integer> printer =
                n -> System.out.println("Result: " + n);

        List<Integer> numbers = List.of(3, 10, 15, 20, 25, 30);

        numbers.stream()
                .filter(greaterThan10AndDivBy5)
                .map(square)
                .forEach(printer);
    }
}
