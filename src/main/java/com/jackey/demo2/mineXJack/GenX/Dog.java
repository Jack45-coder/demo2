package com.jackey.demo2.mineXJack.GenX;

public class Dog extends Animal{
    private String name;

     Dog(String name){
        super(name);
    }

    public void sound(){
        System.out.println("Dog Barking...");
    }

    public String getName(){
         return name;
    }
}
