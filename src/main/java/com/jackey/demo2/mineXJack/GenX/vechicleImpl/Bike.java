package com.jackey.demo2.mineXJack.GenX.vechicleImpl;

public class Bike implements Vehicle {
     String name;

     public Bike(String name){
         this.name = name;
     }

    public void start(){
        System.out.println(name +" is starting with Kick/Push button");
    }

    public void stop() {
        System.out.println(name +" is stopping using brakes.");
    }

    public String getType(){
         return name + " Normal Bike";
    }
}
