package com.threads.concurrency;

import com.threads.basics.Booking;
import com.threads.basics.Greetings;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuteDemo1 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        // creating independent tasks
        executorService.execute(()->{
            System.out.println("doing polling");
            // call Greetings class
            Greetings greet = new Greetings();
            greet.sayHello("kutlu");
        });
        executorService.execute(()->{
            // call the task of booking tickets
            System.out.println("Extracting name from url");
            Booking booking = new Booking();
            System.out.println(booking.bookTickets("siri",20));
        });
        executorService.execute(()->{
            System.out.println("reading from db");
            //call the method of dbConnector class
        });
    }
}
