package com.list.custom;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {

    public static void main(String[] args) {

        List<Vehicle> vehicles =
                Arrays.asList(
                        new Vehicle("City", "Honda", 23_90_000),
                        new Vehicle("Hexa", "Tata", 12_90_000),
                        new Vehicle("City", "Honda", 43_90_000),
                        new Vehicle("City", "Honda", 53_90_000),
                        new Vehicle("City", "Honda", 1190000));

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
        System.out.println("sort by brand");
        //pass the object of the class that implements Comparator
        Collections.sort(vehicles, new BrandSort());
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }


        System.out.println("sort by price");
        //pass the object of the class that implements Comparator
        Collections.sort(vehicles, new PriceSort());
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }
}
