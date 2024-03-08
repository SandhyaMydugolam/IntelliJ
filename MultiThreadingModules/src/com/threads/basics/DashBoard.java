package com.threads.basics;

public class DashBoard {
    public static void main(String[] args) {
        Booking booking = new Booking();
        //3 Counter for 3 people
        Counter counter1 = new Counter("Tom",10,booking);
        Counter counter2 = new Counter("sam",20,booking);
        Counter counter3 = new Counter("rom",12,booking);
    }
}
