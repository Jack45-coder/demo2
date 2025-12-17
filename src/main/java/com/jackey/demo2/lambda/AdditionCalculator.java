package com.jackey.demo2.lambda;

public class AdditionCalculator implements Calculator{
    public void calculate(int a, int b){
        System.out.println("Addition: " + (a+b));
    }
}
