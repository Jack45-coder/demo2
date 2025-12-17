package com.jackey.demo2.mineXJack.GenX.vechicleImpl;

import java.util.List;

public class VehicleUBBox<T extends Vehicle>{
    private List<T> vehicles;

    public VehicleUBBox(List<T> vehicles){
        this.vehicles = vehicles;
    }

    public void startAll(){
        for(T  v : vehicles){
            v.start();
        }
    }

    public void stopAll(){
        for(T v : vehicles){
            v.stop();
        }
    }

}
