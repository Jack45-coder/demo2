package com.jackey.demo2.lambda.asignmentX;

import java.util.function.Consumer;

public class ConsumerArray {
    public static void main(String[] args) {
        Integer[] arr = {10, 20, 30, 40, 50};

        Consumer<Integer> print = n -> System.out.println(n);

        for(Integer n : arr){
            print.accept(n);
        }
    }
}
