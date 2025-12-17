package com.jackey.demo2.mineXJack.GenX.vechicleImpl;

class SportsBike extends Bike{

    public SportsBike(String name){
        super(name);
    }

    public void start(){
        System.out.println(name + " sports bike starting aggressively");
    }

    public void stop(){
        System.out.println(name +" sports bike stopping fast");
    }

    public String getType(){
        return name + " Sports Bike";
    }
}
