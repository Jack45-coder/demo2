package com.jackey.demo2.pms;

public class PmsMain {
    public static void main(String[] args) {
        ParkingLot plot = new ParkingLot(2,4);
        PMSController pmsController = new PMSController(plot);

        Vehicle vehicle1 = new Vehicle("KA-01-HH-1234", "Car");
        Ticket ticket = pmsController.park(vehicle1);
        System.out.println("Parked Vehicle Ticket Details: "+ ticket.toString());




    }
}
