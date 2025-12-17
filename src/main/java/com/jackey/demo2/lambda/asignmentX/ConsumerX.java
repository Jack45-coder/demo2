package com.jackey.demo2.lambda.asignmentX;
/*
🔴 ASSIGNMENT 3 — Consumer with forEach()
Problem
Create a Consumer that prints a string in uppercase.
Use it in forEach() on a stream of strings.
Focus
Writing Consumer lambda
Using Consumer in terminal operation
 */
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerX {
    public static void main(String[] args) {
        Consumer<String> replaceUpperCase = (s) -> System.out.println(s.toUpperCase());
        List<String> names = new ArrayList<>();
        names.add("Jackey");
        names.add("Simpal");
        names.add("Simran");
        names.add("Vivek");
        names.stream().forEach(replaceUpperCase);
    }
}
