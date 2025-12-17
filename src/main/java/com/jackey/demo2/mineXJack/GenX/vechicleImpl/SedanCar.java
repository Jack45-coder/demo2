package com.jackey.demo2.mineXJack.GenX.vechicleImpl;

class SedanCar extends Car{
//    private String name;

   public SedanCar(String name){
        super(name);
   }

   public void stop(){
       System.out.println(name +" SedanCar stoped.");
   }

   public String getType(){
       return name + " Sedan Car";
   }
}
