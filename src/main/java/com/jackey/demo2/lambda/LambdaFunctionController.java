package com.jackey.demo2.lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class LambdaFunctionController {
    // functional interface -> interface with single abstract method.
    //lambda - very much the underlying concept of functional programming, widely used in streams api
    // lambda is foundation for streams [data pipelining: source -> interactive operations -> terminal operations [USE LAMBDA ->
    // GIVES YOU STATELESS OBJECT ] -> terminal operations

    public static void main(String[] args) {

        // lambda expression -> use case is filtering
        Predicate<Integer> isEven = (a) -> {
            System.out.println("You have sent is number: " + a + " ");
            return a % 2 == 0;
        };

        Predicate<Integer> isDivByFive = (a) -> a % 5 == 0;
        Predicate<Integer> isGreaterThan = (a) -> a > 20 == true;

        // execute it right away
        System.out.println(isEven.test(10)); // true
        System.out.println(isEven.test(11)); // false


//        System.out.println(isEven.and(isDivByFive).and(isGreaterThan).test(30));
//        System.out.println(isEven.and(isDivByFive).test(20));

//        Predicate<Integer> isEvenAIC = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return a % 2 == 0;
//            }
//        };


        // terminal operation, consume input but not output
        Consumer<Integer> printNumber = (n) -> System.out.println("Number: " + n);
        printNumber.accept(100);

        // telling what to do, but not when
        // use case
        // data pipeline
        // source [numbers] -> intermediate operations [filter] -> terminal operations [for each]

        Stream<Integer> number = Stream.of(10, 23, 56, 76);
        number.forEach(printNumber);

        Stream<Integer> number2 = Stream.of(10, 23, 35, 43,29, 15, 50);
        number2.filter(isEven).forEach(printNumber);


//        System.out.printf("\nFiltered No: ");
//        Stream<Integer> number3  = Stream.of(10, 15, 20, 25, 30, 35, 40, 45, 60);
//        number3.filter((isDivByFive).and(isGreaterThan))
//                .forEach(n -> System.out.print(n + " "));


        Stream<String> names = Stream.of("Jackey" , "Mohan", "Abhi", "Amar", "Shivm");
        //use - case : data transformation
        // list - [6, 5, 4, ...]

        Function<String, Integer> stringIntegerFunction = (s) -> s.length();
        System.out.println(stringIntegerFunction.apply("Jackey Kumar"));

        names.map(stringIntegerFunction).forEach(printNumber);
    }
}
