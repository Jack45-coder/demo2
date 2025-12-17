package com.jackey.demo2.pms;

public class Slot {
    private int floorNo;
    private int slotNo;
    private Vehicle vehicle;

    Slot(int floorNo, int slotNo,Vehicle vehicle){
        this.floorNo = floorNo;
        this.slotNo = slotNo;
        this.vehicle = null;
    }

    public int getFloorNo(){
        return  floorNo;
    }

    public int getSlotNo() {
        return slotNo;
    }

    public Vehicle getVehicle(){
        return vehicle;
    }

    public void setVechicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
