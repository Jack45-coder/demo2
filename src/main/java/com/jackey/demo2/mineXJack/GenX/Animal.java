package com.jackey.demo2.mineXJack.GenX;

public class Animal{
    private String name;

    public Animal(String name){
        this.name = name;
    }

    public void sleep(){
        System.out.println(name + " Sleeping...");
    }

    public void eat(){
        System.out.println(name + " Eating...");
    }

    public String toString(){
        return getClass().getSimpleName() + "(" + name + ")";
    }
}
