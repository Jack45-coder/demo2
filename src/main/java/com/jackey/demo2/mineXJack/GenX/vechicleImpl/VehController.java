package com.jackey.demo2.mineXJack.GenX.vechicleImpl;

import java.util.ArrayList;
import java.util.List;

public class VehController {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW"));
        cars.add(new Car("Audi"));
        cars.add(new SedanCar("Range Rover"));

        VehicleUBBox<Car> carBox = new VehicleUBBox<>(cars);
        for(Car car : cars){
            System.out.println(car.getType());
            car.start();
        }
        carBox.stopAll();


        List<Bike> bikes = new ArrayList<>();
        bikes.add(new Bike("Yamaha"));
        bikes.add(new Bike("Hero"));
        bikes.add(new SportsBike("Duke 350"));
        bikes.add(new SportsBike("KTM"));


        VehicleUBBox<Bike> bikeBox = new VehicleUBBox<>(bikes);
        for(Bike bike : bikes){
            System.out.println(bike.getType());
            bike.start();
        }

        bikeBox.stopAll();
    }
}
