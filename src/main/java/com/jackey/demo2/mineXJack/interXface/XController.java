package com.jackey.demo2.mineXJack.interXface;

public class XController {
    public static void main(String[] args) {
        String carName = "Maruti Suzuki";
        String carModel = "";
        String bikeName = "KTM";

        Vehicle car = () -> {
            System.out.println(carName + " Start with Key");
        };

        Vehicle bike = () -> {
            System.out.println(bikeName +" Self start with btn");
        };

        car.startT();
        bike.startT();


    }
}
