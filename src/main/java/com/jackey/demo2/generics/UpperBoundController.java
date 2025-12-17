package com.jackey.demo2.generics;
import java.util.*;

public class UpperBoundController {

    private ListInterface listInterface;
    public static void main(String[] args) {
        ListInterface listInterface = new ListInterfaceImpl();

        List<Integer> integerList = List.of(1, 2, 3, 4, 5);
        List<Double> doubleList = List.of(1.5, 2.2, 4.2, 5.98);
        List<Dog> dogs = List.of(new Dog("Buddy"), new Dog("Max"));
        List<Cat> cats = List.of(new Cat("Sandy"), new Cat("Andy"));

        printNumbers(integerList);
        printNumbers(doubleList);
        printAnimal(dogs);
        printAnimal(cats);


        Map<String, ? extends Number> numberMap = Map.of(
                "one", 1,
                "two", 2.0,
                "Three",  3L
        );

        for(Map.Entry<String, ? extends Number> entry : numberMap.entrySet()){
            String key = entry.getKey();
            Number value = entry.getValue();
            System.out.println(key + " : " + value);
        }

        List<Number> numberList = new ArrayList<>();
        List<Integer> inteList = new ArrayList<>();
//        addNumbers(inteList);
        addNumbers(numberList);
        List<Double> dList = new ArrayList<>();
        addDouble(dList);

        //interface usage
        listInterface.addNumbers(numberList);
//        listInterface.addNumbers(inteList);

    }


    // Ex 1: using upper bounded wildcard with a list
    public static void printNumbers(List<? extends Number> numbers){
           for(Number number : numbers){
               System.out.println(number);
           }
    }

    // only Integers
    public static void printIntegers(List<Integer> numbers){
        for (Number number : numbers){
            System.out.println(number);
        }
    }

    // only Double
    public static void printDouble(List<Double> numbers){
        for (Number number : numbers){
            System.out.println(number);
        }
    }

    // Animal

    // PECS: Producer Extends [UB], Consumer Super[LB]
    public static void printAnimal(List<? extends Animal> animals){
//        animals.add(new Dog("Rex")); compile time error: cannot add to a list with an upper-bounded wildcard
        for (Animal animal : animals){
            System.out.println(animal.getName());
            animal.eat();
        }
    }


    // upper bound -> T and its subclasses --> for reading date
    // Lower bound -> T and its supper classes --> for writing data
    
    // limits the type to Integer and its super types
    // number
    // object

    // List<? super Integer> list means that list can be a list of Integer, Number, or object
    // exact type - unknown

    public static void addNumbers(List<? super Number> list){

    }

    public static void addDouble(List<? super Double> list){
        list.add(1.5);

    }

}
