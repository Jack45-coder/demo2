package com.jackey.demo2.mineXJack.GenX;

public class Goat extends Animal{
    private String name;

    Goat(String name){
         super(name);
    }

    public String getName(){
        return name;
    }

    public void sound(){
        System.out.println("Meh Meh meh...");
    }
}
