package com.jackey.demo2.generics;
import java.util.concurrent.atomic.AtomicInteger;

// lower bound -> wildcard
// upper bound -> wildcard


public class BoundedGenericsController {
    public static void main(String[] args) {
        BoxNumber<Integer> intBox = new BoxNumber<>();
        intBox.setValue(101);
        System.out.println("Integer Value: " +intBox.getValue());


        BoxNumber<Double> doubleBox = new BoxNumber<>();
        doubleBox.setValue(455.75);
        System.out.println("Double Value: " +doubleBox.getValue());

        BoxNumber<AtomicInteger> strBox = new BoxNumber<>();
        strBox.setValue(new AtomicInteger(1099));
        System.out.println( "Atomic Integer value: "+ strBox.getValue());

        AnimalBoundedGenerics<Animal> animalBox = new AnimalBoundedGenerics<>();
        AnimalBoundedGenerics<Cat> catBox = new AnimalBoundedGenerics<>();
        AnimalBoundedGenerics<Dog> dogBox = new AnimalBoundedGenerics<Dog>();
    }
}
