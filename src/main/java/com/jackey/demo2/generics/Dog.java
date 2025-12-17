package com.jackey.demo2.generics;

public class Dog extends Animal{
    private String name;

    public Dog(String name){
        super(name);
    }

    public void eat(){
        System.out.println("Dag eat");
        System.out.println("bark");
    }

    public void bark(){
        System.out.println(name + "is bark");
    }
}
