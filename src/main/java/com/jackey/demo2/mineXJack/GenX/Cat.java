package com.jackey.demo2.mineXJack.GenX;

public class Cat extends Animal{
    private String name;

    Cat(String name){
        super(name);
    }

    public void sound(){
        System.out.println("Cat Meow...");
    }

    public String getName(){
        return name;
    }
}
