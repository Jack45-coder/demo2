package com.jackey.demo2.mineXJack.GenX.vechicleImpl;

public class Car implements Vehicle {
    String name;
    public Car(String name){
        this.name = name;
    }

    public void start() {
        System.out.println(name +" is starting with ignition key.");
    }

    public void stop() {
        System.out.println(name +" Car is stopping smoothly.");
    }

    public String getType(){
        return name + " Normal Car";
    }
}
