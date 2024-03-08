package com.oops.overloading;

public class Vehicle {
    String brand;
    double price;
    String model;

    public Vehicle(String brand, String model) {
        this(brand);
        System.out.println("two");
        this.brand = brand;

    }

    public Vehicle(String brand, double price, String model) {
        this(model,brand);
        System.out.println("three");
        this.brand= brand;

    }

    public Vehicle(String brand) {
        this();
        System.out.println("one");
        this.brand = brand;
    }

    public Vehicle() {
    }
    void getDetails(){
        if(brand!=null)
        System.out.println("brand :"+brand);
        if(model!=null)
        System.out.println("brand :"+model);
        if(price>0)
        System.out.println("brand :"+price);
    }
}
