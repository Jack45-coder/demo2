package com.jackey.demo2.mineXJack.GenX;

import java.util.*;

public class AnimalBoundController {

    // PRODUCER → EXTENDS (READ)
    public static void printAnimal(List<? extends Animal> list){
        for(Animal animal : list){
            System.out.println(animal);
            animal.eat();
//            animal.sleep();
        }
    }

    // CONSUMER → SUPER (WRITE)
    public static void addAnimal(List<? super Dog> list){
        list.add(new Dog("Bruno"));
        list.add(new Dog("Rocky"));
    }

    public static void main(String[] args) {
        List<Dog> dogList = new ArrayList<>();
        List<Animal> animalList = new ArrayList<>();
        List<Object> objList = new ArrayList<>();

        animalList.add(new Dog("Tommy"));
        objList.add(new Cat("Kitty"));
        dogList.add(new Dog("Tommy"));
        objList.add(new Cat("koc"));

        //READ
        printAnimal(animalList);
        printAnimal(dogList);





        //WRITE
        addAnimal(dogList);
        System.out.println(dogList);
        addAnimal(objList);
        System.out.println(objList);


    }

}
