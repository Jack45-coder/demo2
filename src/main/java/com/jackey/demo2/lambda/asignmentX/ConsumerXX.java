package com.jackey.demo2.lambda.asignmentX;
/*
🔴 ASSIGNMENT 4 — Consumer for Side Effects
Problem
Given a list of integers, create a Consumer that:
Prints the number
Prints whether it is EVEN or ODD
Use it with forEach() .
Focus
Multi-statement lambda
Side effects using Consumer
 */
import java.util.List;
import java.util.function.Consumer;

public class ConsumerXX {
    public static void main(String[] args) {
        Consumer<Integer> printEvenXOdd = (n) -> {
            System.out.println("Number: " + n);
            if(n % 2 == 0) System.out.println("EVEN");
            else System.out.println("ODD");
        };

        List<Integer> intList = List.of(10, 15, 22, 9);
        intList.stream().forEach(printEvenXOdd);


    }
}
