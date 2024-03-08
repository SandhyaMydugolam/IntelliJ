package com.oops.overloading;

public class VehicleName {
    public static void main(String[] args) {
        Vehicle Vehicle1 = new Vehicle();
        Vehicle Vehicle2 = new Vehicle("swift");
        Vehicle Vehicle3 = new Vehicle("swift", "2020");
        Vehicle Vehicle4 = new Vehicle("swift", 2000000, "2020");
        Vehicle1.getDetails();
        System.out.println("---------");
        Vehicle2.getDetails();
        System.out.println("---------");
        Vehicle3.getDetails();
        System.out.println("---------");
        Vehicle4.getDetails();
        System.out.println("---------");

        {

        }
    }
}
