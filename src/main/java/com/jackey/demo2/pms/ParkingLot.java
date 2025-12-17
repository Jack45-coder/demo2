package com.jackey.demo2.pms;
import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private int numberOfFloors;
    private int slotsPerFloor;
    public boolean isFull = false;

    private List<Slot> slotList = new ArrayList<>();

    public ParkingLot(int numberOfFloors, int slotsPerFloor){
        this.numberOfFloors = numberOfFloors;
        this.slotsPerFloor = slotsPerFloor;
        createSlots(numberOfFloors, slotsPerFloor);
    }

    private void createSlots(int numberOfFloors, int slotsPerFloor){
        for(int i = 0; i < numberOfFloors; i++) {
            for (int j = 0; j < slotsPerFloor; j++) {
                Slot slot = new Slot(i + 1, j + 1,null);
                slotList.add(slot);
            }
        }
    }


    public List<Slot> getSlotList() {
        return slotList;
    }

    public boolean isFull() {
        return isFull;
    }

    public void setFull(boolean full) {
        isFull = full;
    }
}

