package com.jackey.demo2.generics;

public class Animal{
    private String name;

    public Animal(String name){
        this.name = name;
    }

    public void eat(){
        System.out.println(name + " is eating");
    }

    public String getName(){
        return name;
    }
}
