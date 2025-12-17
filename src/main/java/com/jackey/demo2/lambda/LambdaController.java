package com.jackey.demo2.lambda;

public class LambdaController {
    public static void main(String[] args) {
        // painful right?
        // we have to create a class and multiple implement the interface each time
        Calculator addcalculator = new AdditionCalculator();
        addcalculator.calculate(12, 45);
        Calculator mulCalculator = new MultiplicationCalculator();
        mulCalculator.calculate(57, 55);


        // not very performant -> class file
        // using anonymous inner class
        Calculator subtractionCalculator = new Calculator() {
            public void calculate(int a, int b) {
                System.out.println("Subtraction: " + (a - b));
            }
        };
        subtractionCalculator.calculate(130, 75);
        subtractionCalculator.calculate(55, 45);

        // using lambda expression [pass function as parameter]
        // this is a variable [it has some behaviour attached calculate]
        Calculator divisonCalculator = (a, b) -> System.out.println("Division: " + (a / b));
        divisonCalculator.calculate(24, 3);
        divisonCalculator.calculate(3135, 55);

        // lambda variation

        // () -> System.out.println("no parameter")
        // a -> a*2; [single parameter]
        // (a, b) -> a * b;
        // (a, b) ->{
        //  multiple statements.
        // }
    }
}
