package com.threads.basics;

public class Booking {
    public double bookTickets(String name,int noOfTickets) {
        double costPerTicket = 200;
        System.out.println("Booked for "+name);
        double totalPrice = costPerTicket*noOfTickets;
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Total "+totalPrice);
        return  totalPrice;
    }
}
