package com.jackey.demo2.pms;

import java.sql.Timestamp;

public class PMSController {

    private ParkingLot parkingLot;

    public PMSController(ParkingLot parkingLot){
        this.parkingLot = parkingLot;
    }

    Ticket park(Vehicle vehicle){
        if(parkingLot.isFull ){
            return null;
        }
        Ticket ticket = new Ticket();
        for(Slot slot : parkingLot.getSlotList()){
            if(slot.getVehicle() == null){
                slot.setVechicle(vehicle);
                ticket.setFloorNo(slot.getFloorNo());
                ticket.setSlotNo(slot.getSlotNo());
                ticket.setTicketNumber(String.valueOf(slot.getFloorNo()*100 + slot.getSlotNo()));
                ticket.setTimestamp(Timestamp.from(java.time.Instant.now()));
                ticket.setVehicleNo(vehicle.getVehicleNo());
                ticket.setVehicleType(vehicle.getVehicleType());
                return ticket;
            }
        }
        return ticket;
    }

    void unPark(Ticket ticket){
        for(Slot slot : parkingLot.getSlotList()){
            if(slot.getFloorNo() == ticket.getFloorNo() && slot.getSlotNo() == ticket.getSlotNo()){
                slot.setVechicle(null);
            }
        }
    }

}
