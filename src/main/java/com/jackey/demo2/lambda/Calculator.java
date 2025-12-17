package com.jackey.demo2.lambda;

@FunctionalInterface
public interface Calculator {
    void calculate(int a, int b);



    // () -> System.out.println("no parameter")
    // a -> a*2; [single parameter]
    // (a, b) -> a * b;
    // (a, b) ->{
    //  multiple statements.
    // }
}
