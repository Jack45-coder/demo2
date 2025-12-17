package com.jackey.demo2.lambda;

public class LambdaExample {
    public static void main(String[] args) {
        // invokedynamic -> LambdaMetaFactory
        Runnable runnable = () -> System.out.println("Inside Run");
        runnable.run();

       // LambdaMetaFactory -> java runtime factory
        // LambdaMetaFactory -> lambdaExpression -> real object an runtime via invoke dynamic instruction
    }

    // java 8 Introduced
    // functional interfaces
    // lambda expression
    // stream

    // functional interfaces - we will go through example and also see stream [predicate -> filter, map[function], reduce]
}
