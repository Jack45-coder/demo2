package com.jackey.demo2.lambda;

public class MultiplicationCalculator implements Calculator{
    public void calculate(int a, int b){
        System.out.println("Multiplication: " + (a*b));
    }
}
