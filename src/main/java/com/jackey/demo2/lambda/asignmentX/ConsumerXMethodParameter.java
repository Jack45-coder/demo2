package com.jackey.demo2.lambda.asignmentX;

import java.util.function.Consumer;
import java.util.List;

/*
🔴 ASSIGNMENT 10 — Consumer as Method
Parameter
Problem
Write a method:
static void consume(List<String> list, Consumer<String> action)
Use stream + forEach inside.
Call it with:
print normally
print length of string
Focus
Consumer injection
Clean lambda design
 */
public class ConsumerXMethodParameter {
    static void consume(List<String > list, Consumer<String> action){
        list.stream()
                .forEach(action); // injected behavior
    }
    public static void main(String[] args) {
         Consumer<String> printNormal = s -> System.out.println(s + " ");
         Consumer<String> printLength = (s) -> System.out.println(s.length());

         List<String> names = List.of("JackDon", "Deepali", "Sonali", "Sujata");
         consume(names, printLength);
         consume(names,printNormal);
    }

}
