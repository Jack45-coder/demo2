package com.jackey.demo2.generics;

public class Cat extends Animal{

    public Cat(String name){
        super(name);
    }

    public void eat(){
        System.out.println("Cat eat");
        System.out.println("Meow");
    }

    public void meow(){
        System.out.println("Meow!");
    }
}
